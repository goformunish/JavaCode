public class excepti {
	void invoke() {
		System.out.println("Invoke browser");
	}

	void login() throws ArrayIndexOutOfBoundsException, Exception{
		
			int arr[] = { 1, 2, 3, 4, 5 };
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		System.out.println("Login method");
	}

	void adduser() {
		System.out.println("Add user method");
	}

	void logout() {
		System.out.println("Logout method");
	}

}
