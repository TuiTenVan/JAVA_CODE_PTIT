import java.util.*;
class Invoices implements Comparable<Invoices> {
    private String invoice_code, invoice_name;
    private long amount, discount, pay;
    public Invoices(){
    }
    public void setDefaultInvoice(String invoice_code, long amount){
        this.invoice_code = invoice_code;
        this.amount = amount;
    }
    public String getInvoiceCode(){
        return this.invoice_code.substring(0, 3);
    }
    public void setInvoiceName(String invoiceName){
        this.invoice_name = invoiceName;
    }
    public void solvePrice(long price){
        this.pay = this.amount * price;
        this.discount = this.pay;
        if(this.amount >= 150){
            this.discount *= 0.5;
        }
        else if(this.amount >= 100){
            this.discount *= 0.3;
        }
        else if(this.amount >= 50){
            this.discount *= 0.15;
        }
        else this.discount = 0;
        this.pay -= this.discount;
    }
    public int compareTo(Invoices other) {
        if (this.pay < other.pay) {
            return 1;
        } else if (this.pay > other.pay) {
            return -1;
        }
        return 0;
    }
    public void outInvoice(){
        System.out.println(this.invoice_code + " " + this.invoice_name + " " + this.discount + " " + this.pay);
    }
}

class Items {
   private String item_code, item_name;
   private long price1, price2;
   public Items(String item_code, String item_name, long price1, long price2) {
       this.item_code = item_code;
       this.item_name = item_name;
       this.price1 = price1;
       this.price2 = price2;
   }
  public String getItemCode(){
      return this.item_code;
  }
  public long getPrice1(){
      return this.price1;
  }
  public long getPrice2(){
      return this.price2;
  }
  public String getItemName(){
      return this.item_name;
  }
}

public class J06002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List <Invoices> a = new ArrayList<>();
        Map<String, Items> mpItems = new HashMap<>();
        while(t-- > 0){
            sc.nextLine();
            Items tmp = new Items(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            mpItems.put(tmp.getItemCode(), tmp);
        }
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String tmp = sc.nextLine();
            String invoice_code  = tmp.substring(0, 3);
            String tmp1 = "";
            for(int j = 3; j < tmp.length(); j++){
                if(tmp.charAt(j) != ' '){
                    tmp1 += tmp.charAt(j);
                }
            }
            long amount = Long.parseLong(tmp1);
            Invoices iv = new Invoices();
            String stt = "" + i;
            while(stt.length() < 3){
                stt = "0" + stt;
            }
            iv.setDefaultInvoice(invoice_code + "-" + stt, amount);
            a.add(iv);
        }
        for(Invoices invoice : a){
            String code = "";
            code += invoice.getInvoiceCode().substring(0, 2);
            String type = "";
            type += invoice.getInvoiceCode().charAt(2);
            Items tmp = mpItems.get(code);
            invoice.setInvoiceName(tmp.getItemName());
            if(type.compareTo("1") == 0){
                invoice.solvePrice(tmp.getPrice1());
            }
            else{
                invoice.solvePrice(tmp.getPrice2());
            }
        }
        Collections.sort(a);
        for(Invoices invoice : a){
            invoice.outInvoice();
        }
    }
}
