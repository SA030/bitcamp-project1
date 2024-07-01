package bitcamp.project1;

import bitcamp.project1.Util.UserCommand;
import bitcamp.project1.page.MenuPage;


//                                                  [page]
//                                                  +void menu()
//                                                  +void getScanner()
//                                                  +String printTUI()
//                                                  +int setSubMenuNum()
//                                                  +void setSubMenu()
//                                                  +void selectMenu(int)
//                                                    |
//                                                    |
//                                                    |
//  [MenuCommand]          ->[UserCommand]         ->[UserPage]
//  -subMenuList             -userList
//  -subMenuSize
//  -LINEWIDTH             ->[AccountCommand]      ->[AccountPage]
//                           -User
//
//                         ->[MoneyKingCommand]    ->[MoneyKingPage]
//
//
//                         ------------------------>[MenuPage]
//
//                                                    |
//                                                    |
//                                                    |
//                                                  [Home]

//  <User Class>
// -accountList   ----------------------------><Account Class>
// -seqNo(prikey)(*Not implemented)            -account
// -ID                                         -description
// -PW
// -total

public class Home {
  public static void main(String[] args) {
    //DummyData
    DummyData.addUserDummy(UserCommand.userList);
    MenuPage m = new MenuPage();

    System.out.print(printPojectName());

    m.menu();
  }


  public static String printPojectName(){
    String str ="";

    str+="\n\n";
    str+="· ··÷¦÷·· ·· ··÷¦÷·· ·· ··÷¦÷·· ·\n";
    str+="     <<<< MONEY KING >>>>\n";
    str+="    💵 팀명: 미래의 부자들\n";
    str+="    💵 팀원: 장혜정 이선아\n";
    str+="· ··÷¦÷·· ·· ··÷¦÷·· ·· ··÷¦÷·· ·\n";
    str+="\n\n";

    return str;
  }
}// Class Home END
