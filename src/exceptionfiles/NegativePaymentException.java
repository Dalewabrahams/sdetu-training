package exceptionfiles;

public class NegativePaymentException extends Exception {
	
		private double payment;

		public NegativePaymentException(double payment) {
			this.payment = payment;
			
		}
	
		@Override
		public String toString() {
			return "Error : You cannot pay a negative value of " + payment;
		}
	
}
