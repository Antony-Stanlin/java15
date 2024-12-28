public class RecordExample {

    record Transaction(String accNo,double amount,String date) {
        @Override
        public String toString(){
            return """
                    [Account Number: %s, Amount: %.2f, Date: %s ]
                    """.formatted(accNo, amount,date);
        }
    }

    public static void main(String[] args) {
        Transaction transaction1=new Transaction("12345678", 10000.67, "15/09/2020");
        //transaction1.amount=1.0;
        System.out.println(transaction1);
        System.out.println(transaction1.accNo());
        
    }
}
