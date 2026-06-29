/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author Sophia Javed, 2026
 */
public class PasswordValidator {
        boolean validPassword = false;
        String password = "";
        
    public PasswordValidator(String password) {
        this.password = password;
    }
        
    public String passwordValidate(String password) {
    // While validPassword is INVALID (we must assume the password is INVALID UNTIL IT'S PROVEN TO BE VALID!!!):
        while (!validPassword) {
            
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password: "); 

            Scanner in = new Scanner(System.in);
            String updatedPassword = in.nextLine();
            
            int specialCharCount = 0;
            
            //iterate over each character to see if it is a special character
            for (int i = 0; i < updatedPassword.length(); i++) {
                if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            
            if (specialCharCount > 0 && password.length() > 7) {
                validPassword = true;
//                updatedPassword = password;
            }
            
            
        } // loop only ends when password is valid so now we create the User
        
    } // end of passwordValidate
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

}
