# java-atm-project
// This is an atm java project from codecademy 

public class ATM {
  
  public static int totalMoney = 0;
  public static int numATMs = 0;

  public int money;
  
  public ATM (int inputMoney) {
    this.money = inputMoney;
    numATMs = numATMs + 1;
    totalMoney = inputMoney + totalMoney;
 }
 
 
  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
      totalMoney = totalMoney - amountToWithdraw;
    }
}
