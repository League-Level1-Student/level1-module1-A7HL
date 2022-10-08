package _06_vault;

public class vaultRunner {
	public static void main(String[] args) {
		
		Vault v = new Vault();
		System.out.println(v.tryCode(0));
		SecretAgent agent = new SecretAgent();
		System.out.println(agent.findCode(v));
	}
}
	class SecretAgent{
		
		public int findCode(Vault x) {
			int i = 0;
			while(true) {
			
			if(x.tryCode(i)==true) {
				return i;
			}
			else if( i <1000001){
				i++;
			}
			else {
				return -1;
			}
			
			
			}
		}
	}
