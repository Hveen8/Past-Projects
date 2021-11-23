/*
Password Generator
By Harry van der Veen
Made on 04/11/19

This program will take a user name and password from the user and return this information to them
 */
package password.generator;

public class Password_Generator extends javax.swing.JFrame {


    public Password_Generator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelabel = new javax.swing.JLabel();
        enterusernamelabel = new javax.swing.JLabel();
        enterpasswordlabel = new javax.swing.JLabel();
        usernameinput = new javax.swing.JTextField();
        passwordinput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titlelabel.setText("Password Generator");

        enterusernamelabel.setText("Enter Username:");

        enterpasswordlabel.setText("Enter Password:");

        jButton1.setText("Generate Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        output.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(titlelabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterusernamelabel)
                                    .addComponent(enterpasswordlabel))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameinput)
                                    .addComponent(passwordinput, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {enterpasswordlabel, enterusernamelabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelabel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterusernamelabel)
                    .addComponent(usernameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpasswordlabel)
                    .addComponent(passwordinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = usernameinput.getText(),  //Creating the variables
               password = passwordinput.getText();
        username = username.toLowerCase();  //Turning the username lowercase characters
        
        if (password.length() < 8){ //This checks the length of the password to make sure it is long enough
            output.setText("<html>Password must contain at least 8 characters!</html>");
        }   
        else {  //If the password is of good length, this turns it lower case, and adds a number between 1 and 100 to the end
            password = password.toLowerCase().concat("" + (int)Math.ceil(Math.random() * 100));
        
            output.setText("<html>Username:\t" + username + "<P>Password:\t" + password + "</html>");   //printing the modified username and password
        }
        
                for (int i = 0; i < password.length(); i++){    //This will forbid spaces from being in the password to avoid confusion
            if (password.charAt(i) == 32){   //This is checking if the letter is a 'space' ( 32 in the ascii is a 'space')
                output.setText("<html>Password cannot contain spaces!</html>");
            }
        }
                for (int i = 0; i < username.length(); i++){    //This will forbid spaces from being in the username to avoid confusion
            if (username.charAt(i) == 32){   //This is checking if the letter is a 'space' ( 32 in the ascii is a 'space')
                output.setText("<html>Username cannot contain spaces!</html>");
            }
        }
                if (username.length() == 0) {   //If no username has been given, the user will be told to
                output.setText("<html>Invalid username!</html>");
            }
          
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Password_Generator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpasswordlabel;
    private javax.swing.JLabel enterusernamelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel output;
    private javax.swing.JTextField passwordinput;
    private javax.swing.JLabel titlelabel;
    private javax.swing.JTextField usernameinput;
    // End of variables declaration//GEN-END:variables
}
