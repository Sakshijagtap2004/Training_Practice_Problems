import java.util.*;
class Adminoption{
  int p=0;
  static String movie [] = new String[10];
  String selectedMovie [] = new String[10];
  public void Adminoption(){
  Scanner sc = new Scanner(System.in);
  while(true){
    System.out.println("enter the option");
    System.out.println("1. Add list of movies 2. Select movie 3.Buy Ticket 4.show Ticket 5.cancel ticket");
    int ch1 = sc.nextInt();
    switch(ch1){
      case 1:
        System.out.println("enter name of movie:");
        movie[p] = sc.next();
        ++p;
        break ;
      case 2:
        System.out.println("movies available");
        for(int r=0;r<p;r++){
          System.out.println(movie[r]);
          }
        System.out.println("select a movie");
        selectedMovie[p] = sc.next();
        ++p;
        break;
      case 3:
        buyTicket(sc);
              break;
      case 4:
        showTicket();
          break;
      case 5:
        cancelTicket(sc);
          break;
      default:
        System.out.println("Invalid option. Please choose again.");




    }


  }
  }
  private void buyTicket(Scanner sc) {
        System.out.println("Enter the seat number:");
        int seatNumber = sc.nextInt();

        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number. Please choose a seat between 1 and 10.");
            return;
        }

        if (selectedMovie[seatNumber - 1] == null) {
            selectedMovie[seatNumber - 1] = "Booked";
            System.out.println("Ticket booked successfully for seat number " + seatNumber);
        } else {
            System.out.println("Seat already booked. Please choose another seat.");
        }
    }
    
    private void showTicket() {
        System.out.println("Movie\t\tSeat");
        for (int r = 0; r < p; r++) {
            System.out.println(selectedMovie[r] + "\t\t" + (r + 1));
        }
    }

    private void cancelTicket(Scanner sc) {
        System.out.println("Enter the seat number to cancel:");
        int seatNumber = sc.nextInt();

        if (seatNumber < 1 || seatNumber > p) {
            System.out.println("Invalid seat number. Please choose a valid seat to cancel.");
            return;
        }

        selectedMovie[seatNumber - 1] = null;
        System.out.println("Ticket canceled successfully for seat number " + seatNumber);
    }

}
class Test extends Adminoption{
  static Test t1 = new Test();
  String password [] = new String[10];
  String name [] = new String[10];
  String address [] = new String [10];
  String mob [] = new String [10];
  String username [] = new String [10];
  Scanner sc = new Scanner(System.in);
  int j = 0;
  
  public void adminLogin(){
    String adminUsername = "Sakshi";
    int adminPassword = 1234;
    Scanner sc = new Scanner(System.in);
      System.out.println("enter the username :");
      String s = sc.next();
      System.out.println("enter the Password :");
      int p = sc.nextInt();

      if(adminUsername.equals(s) && adminPassword == p){
        System.out.println("Admin login Successful");
        t1.Adminoption();
      }
      else{
          System.out.println("Admin login Unsuccessful");
      }
  }

  public void userResgistration(){
        System.out.println("enter name :");
        name[j] = sc.next();
        System.out.println("enter mob no :");
        mob[j] = sc.next();
        System.out.println("enter address :");
        address[j] = sc.next();
        System.out.println("enter username :");
        username[j] = sc.next();
        System.out.println("enter password :");
        password[j] = sc.next();
        ++j;
  }
  public void showInfo(){
    System.out.println("username   password");
    System.out.println(" ----------------------------------------------");
    for(int k=0;k<j;k++){
    System.out.println(username[k]+"\t\t"+password[k]);

    }
    
  }

public void userLogin() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the username :");
    String s1 = sc.next();
    System.out.println("enter the Password :");
    String p1 = sc.next();
    
    for (int i = 0; i < j; i++) {
        if (username[i] != null && password[i] != null && username[i].equals(s1) && password[i].equals(p1)) {
            System.out.println("user login Successful");
            return;
        }
    }

    System.out.println("user login Unsuccessful");
}

}
class Movie{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    Test t = new Test();
    Test t1 = new Test();
    while(true){
    System.out.println("Enter a login type:");
    System.out.println("1.Admin 2.User 3.User Restration 4.show");
    int ch = sc.nextInt();
      switch(ch){
        case 1:
          t.adminLogin();
          break;
        case 2:
          t.userLogin();
          break;
        case 3:
          t.userResgistration();
          break;
        case 4:
          t.showInfo();
          break;

      }
    }

  }
}