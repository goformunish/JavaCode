--get generic api
package com.sif.api.common;

import java.util.Iterator;

import com.siperian.sif.client.SiperianClient;
import com.siperian.sif.message.Record;
import com.siperian.sif.message.RecordKey;
import com.siperian.sif.message.RecordTypes;
import com.siperian.sif.message.SiperianObjectType;
import com.siperian.sif.message.mrm.GetRequest;
import com.siperian.sif.message.mrm.GetResponse;

public class GetGenericAPI {
	private static SiperianClient siperianClient;

	public static void main(String[] args) {
		SIFSiperianClientPool oSifSiperianClientPool = new SIFSiperianClientPool();
		try {
			siperianClient = oSifSiperianClientPool.getSiperianClientFromPool();
			System.out.println("mdm connection successfull");
			GetGenericAPI oGetGenericAPI = new GetGenericAPI();
			oGetGenericAPI.getCust();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				SiperianClientPool.getInstance().returnObject(siperianClient);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private void getCust() {
		GetRequest request = new GetRequest();
		RecordKey recordKey = new RecordKey();
		recordKey.setRowid("1");
		request.setRecordKey(recordKey);

		RecordTypes rTypes = new RecordTypes();
		rTypes.setXrefType(true);
		request.setRecordTypes(rTypes);

		request.setSiperianObjectUid(SiperianObjectType.PACKAGE.makeUid("PKG_PARTY"));
		GetResponse response = null;

		try {
			response = (GetResponse) siperianClient.process(request);
		} catch (Exception e) {
			System.out.println("failure processing request: " + e);
		}
		Iterator recordIter = response.getRecords().iterator();
		System.out.println("---------- generic api----------------");
		String displayName = "";
		while (recordIter.hasNext()) {
			Record record = (Record) recordIter.next();
			System.out.println("Siperian object UID: " + record.getSiperianObjectUid());
			displayName = record.getField("DISPLAY_NAME").getStringValue();
		}
		System.out.println("Display Name: " + displayName);
	}
}

--sifsiperianclient
package com.sif.api.common;

import java.io.File;

import com.siperian.sif.client.SiperianClient;

public class SIFSiperianClient {
	public static void main(String[] args) {
		SIFSiperianClient oSifSiperianClient = new SIFSiperianClient();

		oSifSiperianClient.getSiperianClient();
		System.out.println("MDM Hub connection successfull");

	}

	private SiperianClient getSiperianClient() {
		SiperianClient oSiperianClient = null;
		try {
			oSiperianClient = SiperianClient.newSiperianClient(
					new File("C:\\Users\\C58810\\eclipse-workspace\\MDM1041\\properties\\siperian-client.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {

		}
		return oSiperianClient;
	}
}
--sif siperian client pool
package com.sif.api.common;

import java.io.File;

import com.siperian.sif.client.SiperianClient;

public class SIFSiperianClientPool {
	public static void main(String[] args) {
		SIFSiperianClientPool oSifSiperianClientPool = new SIFSiperianClientPool();
		SiperianClient oSiperianClient = null;
		try {
			oSiperianClient = oSifSiperianClientPool.getSiperianClientFromPool();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				SiperianClientPool.getInstance().returnObject(oSiperianClient);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private SiperianClient getSiperianClient() {
		SiperianClient oSiperianClient = null;
		try {
			oSiperianClient = SiperianClient.newSiperianClient(
					new File("C:\\Users\\C58810\\eclipse-workspace\\MDM1041\\properties\\siperian-client.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {

		}
		return oSiperianClient;
	}

	public SiperianClient getSiperianClientFromPool() {

		SiperianClient oSiperianClient = null;
		try {
			oSiperianClient = (SiperianClient) SiperianClientPool.getInstance().borrowObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return oSiperianClient;
	}
}

--sip client factory
package com.sif.api.common;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.commons.pool.BasePoolableObjectFactory;

import com.siperian.sif.client.SiperianClient;

public class SiperianClientFactory extends BasePoolableObjectFactory {
	private final String stThisClass = "SiperianClientFactory";

	public SiperianClientFactory() {
		super();
	}

	@Override
	public Object makeObject() throws Exception {
		SiperianClient oSiperianClient = null;

		try {
			Properties oProperties = new Properties();
			oProperties.setProperty("siperian-client.orsId", "<ors>");
			oProperties.setProperty("siperian-client.username", "<user>");
			oProperties.setProperty("siperian-client.password", "pass");
			oProperties.setProperty("siperian-client.protocol", "http");
			oProperties.setProperty("http.call.url", "https://localhost:8080/cmx/request");
			oSiperianClient = (SiperianClient) SiperianClient.newSiperianClient(oProperties);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return oSiperianClient;
	}

	public void activateObject(SiperianClient obj) throws Exception {
		super.activateObject(obj);
	}

	public void destroyObject(SiperianClient obj) throws Exception {
		super.destroyObject(obj);
	}

	public void passivateObject(SiperianClient obj) throws Exception {
		super.passivateObject(obj);
	}

	public boolean validateObject(SiperianClient obj) {
		return super.validateObject(obj);
	}
}

--sip client pool
package com.sif.api.common;

import javax.management.BadAttributeValueExpException;

import org.apache.commons.pool.impl.GenericObjectPool;

import com.siperian.sif.client.SiperianClient;

public class SiperianClientPool extends GenericObjectPool {

	private static final String stThisClass = "SiperianClientPool";
	private static SiperianClientPool instance;

	private SiperianClientPool(SiperianClientFactory objfactoryPool, int maxActive, byte whenExhaustedAction,
			long maxWait, int maxIdle, boolean testOnBorrow, boolean testOnReturn) {
		super(objfactoryPool, maxActive, whenExhaustedAction, maxWait, maxIdle, testOnBorrow, testOnReturn);
	}

	public SiperianClient borrowObject() throws Exception {
		return (SiperianClient) super.borrowObject();
	}

	public void returnObject(SiperianClient obj) throws Exception {
		super.returnObject(obj);
	}

	public static SiperianClientPool getInstance() {
		final String stThisMethod = "getInstance";
		try {
			int intmaxActive = 500;
			int intMaxIdle = 100;
			long lMaxWait = 300000;
			if (instance == null) {
				instance = new SiperianClientPool(new SiperianClientFactory(), intmaxActive, WHEN_EXHAUSTED_GROW,
						lMaxWait, intMaxIdle, true, true);
			}
			System.out.println(
					"Number of actve threads are " + instance.getMaxActive() + " and number of idle threads are "
							+ instance.getNumIdle() + " and max wait times are " + lMaxWait + " milliseconds");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}

	public synchronized void setMaxActive(int maxActive) {
		super.setMaxActive(maxActive);
	}

	public synchronized void setMaxIdle(int maxIdle) {
		super.setMaxIdle(maxIdle);
	}

	public synchronized int getNumActive() {
		return super.getNumActive();
	}

	public synchronized int getNumIdle() {
		return super.getNumIdle();
	}

	public synchronized void setMaxWait(long maxWait) {
		super.setMaxWait(maxWait);
	}

	public synchronized void setWhenExhaustedAction(byte whenExhaustedAction) {
		super.setWhenExhaustedAction(whenExhaustedAction);
	}
}
