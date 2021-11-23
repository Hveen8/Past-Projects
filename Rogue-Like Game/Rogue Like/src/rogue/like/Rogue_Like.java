/*
Rogue-Like
By Harry van der Veen
Made on 12/18/19

This is a game that makes use of XML files,
object arrys, searching and sorting algorithms, amd
other custom functions
 */

package rogue.like;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public final class Rogue_Like extends javax.swing.JFrame {

    public Rogue_Like() {
        initComponents();
        
        //making the startup window
        Object[] startOptions = {"Erase Save", "Start Game", "Exit"};
        int n = JOptionPane.showOptionDialog(null,
            null,
            "Rogue-Like",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            startOptions,
            startOptions[0]);
        //when the "New Game" button is pushed, all information is rewritten to the default
        if (n == 0){
            new Rogue_Like().resetSave();
        }
        else if (n == 2){
            System.exit(0);
        }
    }
        public void resetSave(){       
            //This will initialize the save file in the game

            //Creating a file
            try {
                //making the XML file
                OutputStream fout= new FileOutputStream("save.xml");
                OutputStream bout= new BufferedOutputStream(fout);
                OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");
                    out.write("<?xml version=\"1.0\" ");
                    out.write("encoding=\"ISO-8859-1\"?>\r\n");
                    //putting in the info for the XML file
                    out.write("<data>\r\n");
                        out.write("<highscore></highscore>\r\n");
                        out.write("<magic>\r\n");
                            out.write("<spell>\r\n");
                                out.write("<name>Blast</name>\r\n");
                                out.write("<cost>10</cost>\r\n");
                                out.write("<power>2</power>\r\n");
                            out.write("</spell>\r\n");
                        out.write("</magic>\r\n");
                    out.write("</data>\r\n");

                    out.flush();  //flushing out any remaining data
                }
            catch (UnsupportedEncodingException e) {
                System.out.println("This VM does not support the Latin-1 character set.");
            }
            catch (IOException e) {
            System.out.println(e.getMessage());
            }
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WeaponSelectionGroup = new javax.swing.ButtonGroup();
        stageBar = new javax.swing.JProgressBar();
        stageLabel = new javax.swing.JLabel();
        playerHealthBar = new javax.swing.JProgressBar();
        enemyHealthBar = new javax.swing.JProgressBar();
        playerNameLabel = new javax.swing.JLabel();
        enemyNameLabel = new javax.swing.JLabel();
        weaponBox1 = new javax.swing.JComboBox<>();
        weaponBox2 = new javax.swing.JComboBox<>();
        weaponSelector1 = new javax.swing.JRadioButton();
        weaponSelector2 = new javax.swing.JRadioButton();
        attackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        spellBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        spellSelector = new javax.swing.JRadioButton();
        playerManaBar = new javax.swing.JProgressBar();
        fleeButton = new javax.swing.JButton();
        defendButton = new javax.swing.JButton();
        chargeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        actionLog = new javax.swing.JTextArea();
        menuButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stageBar.setBackground(new java.awt.Color(255, 255, 255));
        stageBar.setForeground(new java.awt.Color(204, 153, 0));

        stageLabel.setText("Stage: 1");

        playerHealthBar.setForeground(new java.awt.Color(255, 0, 0));

        enemyHealthBar.setForeground(new java.awt.Color(255, 0, 0));

        playerNameLabel.setText("Player Name");

        enemyNameLabel.setText("Enemy Name");

        weaponBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Weapon" }));

        weaponBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Weapon" }));

        WeaponSelectionGroup.add(weaponSelector1);

        WeaponSelectionGroup.add(weaponSelector2);

        attackButton.setText("Attack");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        spellBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Spell" }));

        jLabel1.setText("Forgotten Spellbook:");

        WeaponSelectionGroup.add(spellSelector);

        playerManaBar.setForeground(new java.awt.Color(0, 255, 255));

        fleeButton.setText("Flee");
        fleeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fleeButtonActionPerformed(evt);
            }
        });

        defendButton.setText("Defend");
        defendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defendButtonActionPerformed(evt);
            }
        });

        chargeButton.setText("Charge Up");
        chargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeButtonActionPerformed(evt);
            }
        });

        actionLog.setEditable(false);
        actionLog.setColumns(20);
        actionLog.setRows(5);
        jScrollPane2.setViewportView(actionLog);

        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        restartButton.setText("Restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(stageBar, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(stageLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(playerManaBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enemyNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(spellBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spellSelector))
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(weaponBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(weaponSelector2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(weaponBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(weaponSelector1)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chargeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fleeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(defendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuButton)
                            .addComponent(restartButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stageBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerNameLabel)
                            .addComponent(enemyNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerManaBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(weaponBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(weaponSelector1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(weaponBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(weaponSelector2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(attackButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chargeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defendButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fleeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spellSelector)
                                    .addComponent(spellBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2))
                        .addGap(82, 82, 82))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //these arrays are for randomizing the names and equipment in the game
    String[] spellNames = {"Overdrive", "Storm", "Warp", "Blitz", "Burst", "Siphon", 
                            "Uber-Charge", "Sunfire", "Missle", "Cutter", "Nova", "Ray"};
    String[] weaponNames = {"Halberd", "Axe", "Dagger", "Hammer", "Flail", "Mace",
                        "Falchion", "Saber", "Lance", "Scimitar", "Spear", "Rapier", "Messer", "Whip"};
    String[] ranks = {"Captin", "Commander", "Sergant", "Knight", "Marshal", "Champion",
                        "Lord", "Master", "Warrior", "Paladin"};
    String[] names = {"Merek", "Carac", "Ulric", "Tybalt", "Borin", "Sadon", "Terrowin",
                      "Rowan", "Forthwind", "Althalos", "Fendrel", "Brom", "Hadrian",
                      "Arabella", "Elizabeth", "Hildegard", "Brunhild", "Adelaide",
                      "Alice", "Beatrix", "Cristiana", "Eleanor", "Emeline", "Isabel",
                      "Juliana"};
    
    int stageNumber = 1;
    int turnNumber = 0;
    int enemiesSlain = 0;
    int ranAway = 0;
    int enemyTotalNumber;
    int enemyCurrentNumber;
    boolean charged = false;
    boolean defense = false;
    boolean enemyCharged = false;
    
    combatant playerStats;
    combatant currentEnemy;
    ArrayList <combatant> enemies = new ArrayList<>();
    ArrayList <weapon> weapons = new ArrayList<>();
    ArrayList <score> scores = new ArrayList<>();
    ArrayList <spell> spells = new ArrayList<>();
    
    class combatant {
        String name;
        int strength, health, currentHealth, mana, currentMana;
        //the combatant class will be used to store information about the player and enemies
        combatant (String _name, int _strength, int _health, int _currentHealth, int _mana, int _currentMana) {
            name = _name;
            strength = _strength;
            health = _health;
            currentHealth = _currentHealth;
            mana = _mana;
            currentMana = _currentMana;
        }
    }

    class weapon {
        String weaponName;
        double power;
        //the weapon class will store weapon information and be used for combat
        weapon (String _weaponName, double _power) {
            weaponName = _weaponName;
            power = _power;
        }
    }

    class score{      
        String playerName;
        int points;
        //the score class keeps track of highscores
        score (String _playerName, int _points) {
            playerName = _playerName;
            points = _points;
        }
    }

    class spell{
        String spellName;
        double power;
        int cost;
        //spells are more powerful than weapons but cost mana to use
        spell (String _spellName, double _power, int _cost) {
            spellName = _spellName;
            power = _power;
            cost = _cost;
        }
    }
    
    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        //increamenting the turn counter and finding the current enemy in the stage based on how many have been killed
        turnNumber++;
        currentEnemy = enemies.get(enemies.size() + (enemyCurrentNumber - enemyTotalNumber - 1));

        updateInfo();

        weapon using = weaponSelected();
        spell chosenSpell;
        int damage;
        //if no weapon is selected, the weapon returnedd from the weaponSelected() method will be named "whoops"
        if (using.weaponName.equals("whoops")){
            return;
        }
        //if a spell is selected, is is converted to a weapon and its cost is taken from the player's mana pool
        else if (using.weaponName.equals("spell")){
            chosenSpell = spells.get((int)using.power);
            using = new weapon(chosenSpell.spellName, chosenSpell.power);
            
                    
            if (chosenSpell.cost > playerStats.currentMana){
                JOptionPane.showMessageDialog(null,
                                          "Not Enough Mana for this Spell",
                                          "Action not Possible",
                                          JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            playerStats.currentMana -= chosenSpell.cost;
        }
        //regenerating mana (it charges faster is there is more mana left)
        playerStats.currentMana = (int)Math.ceil(playerStats.currentMana * (1 + ((playerStats.currentMana / playerStats.mana) + 0.1)) + 1);
        //stopping mana overflow after regeneration
        if (playerStats.currentMana > playerStats.mana){
            playerStats.currentMana = playerStats.mana;
        }
        //damage is found based on the weapon power and the player's strength
        damage = (int)Math.ceil(playerStats.strength * using.power);

        currentEnemy.currentHealth -= damage;

        actionLog.append(playerStats.name + " dealt " + damage + " damage with " + using.weaponName + "\n");
        //if the player charged up the previous turn to double their strength, it is undone after an attack
        if (charged){
            charged = false;
            playerStats.strength *= 0.5;
        }

        enemyMove();
    }//GEN-LAST:event_attackButtonActionPerformed
        private weapon weaponSelected(){
            //this detects what weapon the player has chosen to fight with
            int index;
            weapon selected;

            if (weaponSelector1.isSelected()){
                index = weaponBox1.getSelectedIndex();
                selected = weapons.get(index);
                return selected;
            }
            else if (weaponSelector2.isSelected()){
                index = weaponBox2.getSelectedIndex();
                selected = weapons.get(index);
                return selected;
            }
            else if (spellSelector.isSelected()){
                index = spellBox.getSelectedIndex();
                selected = new weapon("spell", index);
                return selected;
            }
            //if nothing is selected, this message will show and the game will stop
            else{
                JOptionPane.showMessageDialog(null,
                                              "Select Weapon",
                                              "Action Required",
                                              JOptionPane.WARNING_MESSAGE);
            }
            //this is a dummy weapon to return if there is an error
            return new weapon("whoops", 0);
        }
    
        
    private void fleeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fleeButtonActionPerformed
        /*
        flee works by making a random number from 0 to 100.
        If this number is above or below 50, the flee attempt will be successful/failed.
        */
        
        double escapeRoll = Math.ceil(Math.random() * 100);
        double sway;
        
        turnNumber++;
        
        sway = (currentEnemy.currentHealth / currentEnemy.health);
        //if the enemy is at low health, the "sway" makes it easier to escape
        if (escapeRoll > 50 * sway ){
            charged = false;
            enemyCurrentNumber--;
            ranAway++;
            
            JOptionPane.showMessageDialog(null,
                                          playerStats.name + " managed to run away",
                                          "Action Succeeded",
                                          JOptionPane.INFORMATION_MESSAGE);
            //if the player flees from that last enemy in the stage, it will end
            if (enemyCurrentNumber == 0){
                stageEnd();   
            }
            
        }
        else {            
            JOptionPane.showMessageDialog(null,
                                          playerStats.name + " failed to run away",
                                          "Action Failed",
                                          JOptionPane.WARNING_MESSAGE);
            
            enemyMove();
        }
        //reidentifying the current enemy after a flee attempt
        currentEnemy = enemies.get(enemies.size() + (enemyCurrentNumber - enemyTotalNumber - 1));
        updateInfo();
    }//GEN-LAST:event_fleeButtonActionPerformed

    private void chargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeButtonActionPerformed
        //xharging an attack will double the player's strength until the next attck
        if (!charged){
            charged = true;
            playerStats.strength *= 2;
        }

        actionLog.append(playerStats.name + " charged up for an attack\n");
        
        enemyMove();
    }//GEN-LAST:event_chargeButtonActionPerformed

    private void defendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defendButtonActionPerformed
        //if the enemy attacks this turn, the damage is nullified
        defense = true;
        
        actionLog.append(playerStats.name + " assumes a defensive stance\n");
        //regenerating mana (it charges faster is there is more mana left)
        playerStats.currentMana = (int)Math.ceil(playerStats.currentMana * (1 + ((playerStats.currentMana / playerStats.mana) + 0.1)) + 1);
        //stopping mana overflow after regeneration
        if (playerStats.currentMana > playerStats.mana){
            playerStats.currentMana = playerStats.mana;
        }
        
        enemyMove();
        
        defense = false;
    }//GEN-LAST:event_defendButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        //recreating the startup window
        Object[] startOptions = {"Reset Save", "Continue", "Exit"};
        int n = JOptionPane.showOptionDialog(null,
            null,
            "Game Start",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            startOptions,
            startOptions[0]);
        
        if (n == 0){
            resetSave();
            startGame();
        }
        else if (n == 2){
            System.exit(0);
        }
    }//GEN-LAST:event_menuButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        //making a warning popup
        Object[] startOptions = {"Continue", "Cancel"};
        int n = JOptionPane.showOptionDialog(null,
            "This will kill " + playerStats.name,
            "Restart",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            startOptions,
            startOptions[0]);
        
        if (n == 0){
            playerDies();
        }
    }//GEN-LAST:event_restartButtonActionPerformed

    
    public void enemyMove(){
        /*
        The enemy can attack or charge up.
        This is based on RNG, but there is a higher chance for an atack than for a charge
        */
        int move = (int)Math.ceil(Math.random() * 3);
        
        switch (move){
            case 0:
            case 1:
            case 2:
                
                int damage = currentEnemy.strength;
                //if the player is defending, no damage is dealt
                if (defense){
                    actionLog.append("You blocked the enemy's attack\n");
                    break;
                }
                
                playerStats.currentHealth -= damage;
                actionLog.append(currentEnemy.name + " dealt " + damage + " damage\n");
                
                if (enemyCharged){
                    enemyCharged = false;
                    currentEnemy.strength *= 0.5;
                }
                
                break;
            case 3:
                //charge work just like is does for the player, it multiplied strength by 2 until the next attack
                if (!enemyCharged){
                    enemyCharged = true;
                    currentEnemy.strength *= 2;
                }
        
                actionLog.append(currentEnemy.name + " charges a strike\n");
                break;
        }
        
        updateInfo();

        if(playerStats.currentHealth <= 0){
            playerDies();
        }  
        else if(currentEnemy.currentHealth <= 0){
            enemyDies();
        }
    }
    
        public void playerDies(){
        //score is based on efficiency of turns, enemies killed, and the stage the player got to
        int score = (stageNumber * (enemiesSlain - ranAway)) - (int)Math.ceil(Math.sqrt(turnNumber));

        /*
        A gimmick of this game is that a player can choose to record their score on the leaderboard,
        or the can choose to get a new permanent spell in subsequent plays.
        The spell they receive will be more powerful if their had a higher score
        */
            Object[] deathOptions = {"Record Renown", "Create Spell"};
            int n = JOptionPane.showOptionDialog(null,
                playerStats.name + "'s Renown is: " + score,
                playerStats.name + " has Died",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                deathOptions,
                deathOptions[0]);

            if (n == 0){
                recordScore(score);
            }
            if (n == 1){
                makeSpell(score);
            }
            //restarting the game
            actionLog.setText("");
            
            resetVariables();
            generateEnemies();
            startGame();  
    }
            public void recordScore(int playerScore){
                //modifying the XML file
                try {
                    String filepath = "save.xml";
                    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                    Document doc = docBuilder.parse(filepath);  //setting up the file to be edited as a doc
                    doc.getDocumentElement().normalize();

                    //getting the highscore element 
                    Node highscore = doc.getElementsByTagName("highscore").item(0);
                    //the player's score is added to an empty array of scores and a loop adds it the the XML file
                    score currentScore = new score(playerStats.name, playerScore);

                    scores.add(currentScore);

                    scores.stream().map((score) -> {
                        //creating a new score
                        Element newScore = doc.createElement("score");
                        //putting all of the information into the "score"
                        Element name = doc.createElement("name");
                        name.appendChild(doc.createTextNode(score.playerName));
                        newScore.appendChild(name);
                        Element points = doc.createElement("points");
                        points.appendChild(doc.createTextNode(Integer.toString(score.points)));
                        newScore.appendChild(points);
                        return newScore;                
                    }).forEachOrdered((newScore) -> {
                        highscore.appendChild(newScore);
                    });
                    //writing the new information into the XML file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(filepath);
                    transformer.transform(source, result);
                } 
                catch (ParserConfigurationException | TransformerException | IOException | SAXException pce) {
                }
                //clearing the score array
                scores.clear();
            }
            public void makeSpell(int PlayerScore){

                spells.clear();
                //generating a random spell name based off of the player's name
                String spellName = playerStats.name + " " + spellNames[(int)Math.ceil(Math.random() * (spellNames.length - 1))];
                double power;
                int cost;
                //the spell uses the player score to become more or less powerful
                cost = (int)Math.ceil(2 * Math.sqrt(PlayerScore));
                power = (Math.ceil(Math.pow(2, (cost / 3)) + 20) / 100);
                
                //modifying the XML file
                try {
                    String filepath = "save.xml";
                    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                    Document doc = docBuilder.parse(filepath);  //setting up the file to be edited as a doc
                    doc.getDocumentElement().normalize();

                    //getting the magic element 
                    Node magic = doc.getElementsByTagName("magic").item(0);
                    //the player's score is added to an empty array of scores and a loop adds it the the XML file
                    spell currentSpell = new spell(spellName, power, cost);

                    spells.add(currentSpell);

                    spells.stream().map((spell) -> {
                        //creating a new spell
                        Element newSpell = doc.createElement("spell");
                        //putting all of the information into the "spell"
                        Element theName = doc.createElement("name");
                        theName.appendChild(doc.createTextNode(spell.spellName));
                        newSpell.appendChild(theName);
                        Element thePower = doc.createElement("power");
                        thePower.appendChild(doc.createTextNode(Double.toString(spell.power)));
                        newSpell.appendChild(thePower);
                        Element theCost = doc.createElement("cost");
                        theCost.appendChild(doc.createTextNode(Integer.toString(spell.cost)));
                        newSpell.appendChild(theCost);
                        return newSpell;                
                    }).forEachOrdered((newSpell) -> {
                        magic.appendChild(newSpell);
                    });
                    //writing the new information into the XML file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(filepath);
                    transformer.transform(source, result);
                } catch (ParserConfigurationException | TransformerException | IOException | SAXException pce) {
                  } 
            } 
            public void resetVariables(){
                //setting all numerical and boolean variables to their original values
                stageNumber = 1;
                turnNumber = 0;
                enemiesSlain = 0;
                ranAway = 0;
                charged = false;
                defense = false;
                enemyCharged = false;
            }   
            
        public void enemyDies(){
            //upon an enemy death, the player gets to choose a minor stat increase
            Object[] winOptions = {"Train and Increase Strength", "Rest and Regain Health"};
            int n = JOptionPane.showOptionDialog(null,
                "You have defeated the enemy and have some time on your hands",
                "Enemy Defeated",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                winOptions,
                winOptions[0]);

            if (n == 0){
                playerStats.strength += stageNumber;
            }
            else if (n == 1){
                playerStats.currentHealth += (50 + ((int)Math.ceil(Math.random() * 40) - 20));
                
                if (playerStats.currentHealth > playerStats.health){
                    playerStats.currentHealth = playerStats.health;
                }
            }
            
            enemiesSlain++;
            enemyCurrentNumber--;
            //if that was the last enemy in the stage, to next one is generated
            if (enemyCurrentNumber <= 0){
                stageEnd();
            }
            //getting the next current enemy
            currentEnemy = enemies.get(enemies.size() + (enemyCurrentNumber - enemyTotalNumber - 1));
            updateInfo();
    }
    
        
    public void startGame(){
        //creating the player character's stats
        String playerName = JOptionPane.showInputDialog("Name Yourself?");
        
        String playerRank = ranks[(int)Math.ceil(Math.random() * (ranks.length - 1))];
        String playerTitle;
        //all stats are a little random
        int health = 100 + ((int)Math.ceil(Math.random() * 20) - 10);
        int strength = 20 + ((int)Math.ceil(Math.random() * 10) - 5);
        int mana = 50 + ((int)Math.ceil(Math.random() * 20) - 10);
        //if the player doesn't create a name, one will be chosen
        if (playerName == null || playerName.equals("")){       
            playerName = names[(int)Math.ceil(Math.random() * (names.length - 1))];          
        }
        
        playerTitle = playerRank + " " + playerName;
        playerNameLabel.setText(playerTitle); 
        //actually putting the player stats into a combatant class
        playerStats = new combatant(playerTitle, strength, health, health, mana, mana);
        
        generateWeapons();
        //adding weapons to the selection boxes
        weapons.stream().map((n) -> n.weaponName).forEachOrdered((weaponName) -> {
            weaponBox1.addItem(weaponName);
        });
        
        weapons.stream().map((n) -> n.weaponName).forEachOrdered((weaponName) -> {
            weaponBox2.addItem(weaponName);
        });

        currentEnemy = enemies.get(enemies.size() - 1);
        
        updateInfo();
        //creating the leaderboard
        getScores();
        
        selectionSort(scores);
        
        output.setText("Most Renowned Heros:\n");
        
        scores.forEach((score) -> {
            output.append((scores.indexOf(score) + 1) + ": " + score.playerName + " with " + score.points + " renown.\n");
        });
        
        scores.clear();
        
        spells.clear();
        spellBox.removeAllItems();
        //reading and using the spells from the XML file
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("save.xml"));
            doc.getDocumentElement().normalize();
            NodeList listOfSpells = doc.getElementsByTagName("spell");

            //using a loop to print out all of the information
            for (int i = 0; i < listOfSpells.getLength(); i++) {
                Node firstSpellNode = listOfSpells.item(i);
                if (firstSpellNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element firstSpellElement = (Element) firstSpellNode;
                    //spell name
                    NodeList nameList = firstSpellElement.getElementsByTagName("name");
                    Element nameElement = (Element) nameList.item(0);
                    NodeList textNList = nameElement.getChildNodes();
                    String theName = ((Node)textNList.item(0)).getNodeValue().trim();
                    //spell power
                    NodeList powerList = firstSpellElement.getElementsByTagName("power");
                    Element powerElement = (Element) powerList.item(0);
                    NodeList textPList = powerElement.getChildNodes();
                    double thePower = Double.parseDouble(((Node)textPList.item(0)).getNodeValue().trim());
                    //spell cost
                    NodeList costList = firstSpellElement.getElementsByTagName("cost");
                    Element costElement = (Element) costList.item(0);
                    NodeList textCList = costElement.getChildNodes();
                    int theCost = Integer.parseInt(((Node)textCList.item(0)).getNodeValue().trim());
                    //adding all spells to an array
                    spells.add(new spell(theName, thePower, theCost));
                }    
            }
        } catch (SAXParseException err) {} catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(Rogue_Like.class.getName()).log(Level.SEVERE, null, ex);
          }
        
        spells.stream().map((n) -> n.spellName).forEachOrdered((spellName) -> {
            spellBox.addItem(spellName);
        });
        
    }
        public void generateWeapons(){

            weapons.clear();
            weaponBox1.removeAllItems();
            weaponBox2.removeAllItems();

            for (int i = 0; i < 3; i++){
                //generating two weapons with random stats for the player, but they must figure out the weapon's power through use
                double power = 1 + ((Math.ceil(Math.random() * 10) - 5) / 10);
                String name = weaponNames[(int)Math.ceil(Math.random() * (weaponNames.length - 1))];

                weapon newWeapon = new weapon(name, power);

                weapons.add(newWeapon);
            }
        }  
        private void selectionSort(ArrayList<score> list){
            //sorting the highscores
        /*
        This method will compare the first element
        with the preceding elements, switching them if
        they are smaller, until the first element is the smallest.
        This repeats for the second, third, until the last element.
        At that point, the list if fully sorted
        */
        for (int n = 0; n < list.size(); n++){
            for (int i = n + 1; i < list.size(); i++){
                if (list.get(n).points < list.get(i).points){
                    
                    //switching the numbers if the next one is lower
                    score temp = list.get(n);
                    list.set(n, list.get(i));
                    list.set(i, temp);
                }
            }
        }   
    }    
    
        
    public void generateEnemies(){
        //setting a random number of enemies on the stage
        enemyTotalNumber = 2 * stageNumber + (int)Math.ceil(Math.random() * 3);
        enemyCurrentNumber = enemyTotalNumber;
          
        enemies.clear();
        
        //establistiing the difficulty trends
        int strengthIncrement = (int)Math.ceil(Math.pow(2, stageNumber));
        int healthIncrement = (int)Math.ceil(Math.pow(stageNumber, 5));
        
        for (int i = 0; i < enemyTotalNumber; i++){
            //the enemies get random stats based on the stage number
            int health = 50 + healthIncrement + ((int)Math.ceil(Math.random() * 20) - 10);
            int strength = 10 + strengthIncrement + ((int)Math.ceil(Math.random() * 10) - 5);
            String name = ranks[(int)Math.ceil(Math.random() * (ranks.length - 1))];
            //enemies cannot use magic aso they have 0 mana
            combatant enemy = new combatant(name, strength, health, health, 0, 0);
            
            enemies.add(enemy);
        }
    }     
    
    
    public void updateInfo() {
        stageLabel.setText("Stage: " + stageNumber);
        enemyNameLabel.setText(currentEnemy.name);
        
        playerManaBar.setValue((int)Math.ceil(((double)playerStats.currentMana / playerStats.mana) * 100));
        playerHealthBar.setValue((int)Math.ceil(((double)playerStats.currentHealth / playerStats.health) * 100));
        enemyHealthBar.setValue((int)Math.ceil(((double)currentEnemy.currentHealth / currentEnemy.health) * 100));
        stageBar.setValue(100 - (int)Math.ceil(((double)enemyCurrentNumber / enemyTotalNumber) * 100));
    }    
               
    
    public void stageEnd(){
        //once all enemies are defeated, the player gets to choose between two large boosts
        Object[] stageClearOptions = {"Greatly Increase Strength", "Increase Max Health and Mana"};
            int x = JOptionPane.showOptionDialog(null,
            "Health and Mana Restored.\nYou have cleared the stage and find an attribute scroll",
            "Stage Clear",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            stageClearOptions,
            stageClearOptions[0]);

            if (x == 0){
            playerStats.strength *= 1.5;
            }
            if (x == 1){
            playerStats.health *= 2;
            playerStats.mana *= 2;
            }
            //replenishing the player's stats
            playerStats.currentHealth = playerStats.health;
            playerStats.currentMana = playerStats.mana;
            //creating the next stage
            stageNumber++;
            generateEnemies();
            //this is another game mechanic
            graveyard();
            win();
            
            updateInfo();
    }
        public void graveyard(){
            /*
            The graveyard is a chance encounter where the current player can type the name of a past player.
            The name is searched in the leaderboards and if found, the player gets a massive boost. 
            If the name isn't found, the player's stats are cippled.
            */
            //temperarily clearing the leaderboard
            String temp = output.getText();
            output.setText("???????????????");

            int graveyardChance = (int)Math.ceil(Math.random() * 10);
            //there is a small chance of a "graveyard encounter" at the end of each stage
            if (graveyardChance <= 3){
                boolean correctName = false;

                String calledName = JOptionPane.showInputDialog("You find yourself inside a forgotten cemetary.\nPerhaps a spirit will answer if you call its name?");
         
                if (calledName == null || calledName.equals("")){ 
                    //if the player doesn't give a name, nothing happens
                    JOptionPane.showMessageDialog(null, "You decide to move on...", "No Action Made", JOptionPane.INFORMATION_MESSAGE);         
                    }
                else {
                    getScores();

                    //going through every score
                    for (int i = 0; i < scores.size(); i++){

                        //if the name is found, the player gets a bonus, but if the name doesn't exist, they will be penalized
                        if (scores.get(i).playerName.equals(calledName)){
                            correctName = true;
                        }
                    }

                    if (correctName){
                        playerStats.strength *= 1.5;
                        playerStats.health *= 2;
                        playerStats.mana *= 2;
                        playerStats.currentHealth = playerStats.health;
                        playerStats.currentMana = playerStats.mana;

                        JOptionPane.showMessageDialog(null, "The spirit of " + calledName + " smiles upon you...", "Spirit Called", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        playerStats.strength *= 0.5;
                        playerStats.health *= 0.5;

                        if (playerStats.currentHealth > playerStats.health){
                            playerStats.currentHealth = playerStats.health;
                        }
                        
                        JOptionPane.showMessageDialog(null, "That spirit is not here, those that are put a curse on you", "Spirits Engraged", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            //returning the scores array and leaberboard to their original state
            scores.clear();
            output.setText(temp);
        }
        public void win(){
            if (stageNumber == 11){
                //after stage ten, the game is done and the player wins
                Object[] winOptions = {"Leave Forever", "Continue through the Dungeon"};
                int n = JOptionPane.showOptionDialog(null,
                "YOU WIN\nYou spot the exit, and can finally leave this place after being trapped here for more lives than you can remember...\n(WARNING) Leaving will exit the game and reset all progress",
                "You have Reached the End",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                winOptions,
                winOptions[0]);
                
                if (n == 0){
                    resetSave();
                    System.exit(0);
                }
            }
            
        }
        
    public void getScores(){
        //this method populates the "scores" array with scores from the XML
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("save.xml"));
            doc.getDocumentElement().normalize();
            NodeList listOfScores = doc.getElementsByTagName("score");

            //using a loop to print out all of the information
            for (int i = 0; i < listOfScores.getLength(); i++) {
                Node firstScoreNode = listOfScores.item(i);
                if (firstScoreNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element firstScoreElement = (Element) firstScoreNode;
                    //player name
                    NodeList nameList = firstScoreElement.getElementsByTagName("name");
                    Element nameElement = (Element) nameList.item(0);
                    NodeList textNList = nameElement.getChildNodes();
                    String theName = ((Node)textNList.item(0)).getNodeValue().trim();
                    //player points
                    NodeList pointsList = firstScoreElement.getElementsByTagName("points");
                    Element pointsElement = (Element) pointsList.item(0);
                    NodeList textPList = pointsElement.getChildNodes();
                    int thePoints = Integer.parseInt(((Node)textPList.item(0)).getNodeValue().trim());

                    scores.add(new score(theName, thePoints));
                }    
            }
        } catch (SAXParseException err) {} catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(Rogue_Like.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    
    public static void main(String args[]) {       
        
        Rogue_Like Game = new Rogue_Like();
        
        java.awt.EventQueue.invokeLater(() -> {
            Game.setVisible(true);
        });
        //these lines begin the game's functions
        Game.generateEnemies();
        Game.startGame();
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup WeaponSelectionGroup;
    private javax.swing.JTextArea actionLog;
    private javax.swing.JButton attackButton;
    private javax.swing.JButton chargeButton;
    private javax.swing.JButton defendButton;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel enemyNameLabel;
    private javax.swing.JButton fleeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menuButton;
    private javax.swing.JTextArea output;
    private javax.swing.JProgressBar playerHealthBar;
    private javax.swing.JProgressBar playerManaBar;
    private javax.swing.JLabel playerNameLabel;
    private javax.swing.JButton restartButton;
    private javax.swing.JComboBox<String> spellBox;
    private javax.swing.JRadioButton spellSelector;
    private javax.swing.JProgressBar stageBar;
    private javax.swing.JLabel stageLabel;
    private javax.swing.JComboBox<String> weaponBox1;
    private javax.swing.JComboBox<String> weaponBox2;
    private javax.swing.JRadioButton weaponSelector1;
    private javax.swing.JRadioButton weaponSelector2;
    // End of variables declaration//GEN-END:variables
}
