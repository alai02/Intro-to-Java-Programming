DieGame game = new DieGame(); 

   JFrame diceWindow;
    DiePanel die1;
    DiePanel die2;
    JPanel panel;
    JPanel panel2;
    Button button;

    public DieGame() {
        super();
        this.diceWindow = new JFrame();
        this.diceWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.diceWindow.setSize(500, 500);

        this.button = new Button("Roll the dice");
        this.die1 = new DiePanel();
        this.die2 = new DiePanel();
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.diceWindow.add(panel);
        this.panel.add(die1);       

        this.button.setActionCommand("Roll");
        this.button.addActionListener(this);

        this.diceWindow.setVisible(true);

        pack();
    }

    public void paintComponent(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Roll")) {
            this.die1.randomRoll();
            this.die2.randomRoll();
            this.die1.repaint();
            this.die2.repaint();
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private void dot (Graphics g, int row, int col){
    this.pixel = SIZE_CONSTANT / 10 * this.sizeFactor;
    this.circleDiameter = 2 * pixel;
    g.setColor(this.dotColour);
    int y = this.topLeftY + (row * 3 * this.pixel) - 2* this.pixel;
    int x = this.topLeftX + (col * 3 * this.pixel) - 2* this.pixel;
    g.fillOval(x, y, this.circleDiameter, this.circleDiameter);
    }
    
    private void drawDie(Graphics g){
    g.setColor(this.getColour());//BOX
    g.fillRect(this.topLeftX, this.topLeftY, this.sizeFactor * SIZE_CONSTANT, this.sizeFactor * SIZE_CONSTANT);
    
    drawValue(g);
    }
    
    private void drawValue(Graphics g){
    if (this.getValue() != 1){ // 2 3 4 5 6
        dot(g, 1, 1); //top Left
        dot(g, 3, 3); // bottom right
    }
    if (this.getValue() % 2 == 1){//odd number // 1 3 5
        dot (g, 2, 2); // midle
    }
    if (this.getValue() > 3){ // 4 5 6
        dot (g, 1, 3);//top right
        dot (g, 3, 1);//bottom left
    }
    if (this.getValue() == 6){ // 6
        dot (g, 2, 1);//middle left
        dot (g, 2, 3);//middle right
    }
    


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.getColor());
        g.fillRect(this.topCornerLeftX, this.getTopCornerLeftY(), this.getSizeFactor() * SIZE_CONSTANT, this.getSizeFactor() * SIZE_CONSTANT);

    }
    
    
    private void drawDie(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect(this.topCornerLeftX, this.topCornerLeftY, this.sizeFactor, this.rollValue);
        drawValue(g);
    }


    public void dot(Graphics g, int row, int col) {
        g.setColor(Color.ORANGE);
        int y = this.getTopCornerLeftY() + (row * 3 * PIXEL) - 2 * PIXEL;
        int x = this.getTopCornerLeftX() + (row * 3 * PIXEL) - 2 * PIXEL;
        g.fillOval(x, y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
    }

    private void drawValue(Graphics g) {
        if (this.getRollValue() != 1) { // if its greater than one
            dot(g, 1, 1);
            dot(g, 3, 3);
        }
        if (this.getRollValue() % 2 == 1) { //if the remainder is one
            dot(g, 2, 2);
        }
        if (this.getRollValue() > 3) { //if greater than three
            dot(g, 1, 3);
            dot(g, 3, 1);
        }
        if (this.getRollValue() == 6) { // if the value is a 6 
            dot(g, 2, 1);
            dot(g, 2, 3);
        }

    }




this.gameWindow = new JFrame("Die Game Version 1");//-------------------WINDOW
        this.gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.gameWindow.setSize(700, 380);
        this.gameWindow.setVisible(true);

        this.text1 = new JLabel("Die Game by Scott Sandre");//-------------------Title
        Font comicSans = new Font("Comic Sans MS", Font.ITALIC, 27);
        this.text1.setForeground(Color.blue);
        this.text1.setFont(comicSans);

        this.text2 = new JLabel("Output");
        this.text4 = new JLabel("Number of Rolls: ");
        this.text3 = new JLabel("");
        this.text3.setText("Draw - no outcome");
        this.counterText = new JLabel("0");
        this.computerWinsText = new JLabel("0");
        this.userWinsText = new JLabel("0");
        this.text5 = new JLabel("Number of User Wins: ");
        this.text6 = new JLabel("Number of Computer Wins: ");
        //INTS
        this.counter = 0;
        this.userCounter = 0;
        this.computerCounter = 0;
        // this.counterS = String.valueOf(counter);

        this.button1 = new Button("Click here to ROLL");//-------------------Button
        this.button1.setActionCommand("roll");
        this.button1.addActionListener(this);
        this.button1.setBackground(Color.magenta);

        this.die1 = new DiePanel(0, 0, 2, Color.BLACK, Color.GREEN);//-------------------Make Die
        this.die2 = new DiePanel(0, 0, 2, Color.red, Color.white);

        //--------------------------------------------------------------------------
        this.panel3 = new JPanel();//Biggest
        this.panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
        this.panel3.setBackground(Color.yellow);

        this.panel2 = new JPanel();//Inside Panel 3, bellow text
        this.panel2.setLayout(new BoxLayout(panel2, BoxLayout.LINE_AXIS));

        this.panel4 = new JPanel();//inside panel 2, beside Button
        this.panel4.setLayout(new BoxLayout(panel4, BoxLayout.PAGE_AXIS));
        this.panel5 = new JPanel();//inside of panel 4, contains panel 6 and panel 7 beside each other
        this.panel5.setLayout(new BoxLayout(panel5, BoxLayout.PAGE_AXIS));
        this.panel5.setAlignmentY(TOP_ALIGNMENT);
        
        this.panel = new JPanel();//-------------------Panel is inside panel2, inside panel3
        this.panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        this.panel.setAlignmentX(CENTER_ALIGNMENT);
        
        this.panel6 = new JPanel();//in panel 5, to left of panel 7
        this.panel6.setLayout(new BoxLayout(panel6, BoxLayout.LINE_AXIS));
        
        this.panel7 = new JPanel();//in panel 5, to rigth of panel 6
        this.panel7.setLayout(new BoxLayout(panel7, BoxLayout.PAGE_AXIS));
        this.panel7.setAlignmentY(TOP_ALIGNMENT);
        //--------------------------------------------------------------------------
        
        this.panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.panel.add(die1);
        this.panel.add(die2);
        
        this.panel5.add(text4);
        this.panel5.add(text2);
        this.panel5.add(text5);
        this.panel5.add(text6);
        
        this.panel7.add(counterText);
        this.panel7.add(text3);
        this.panel7.add(userWinsText);
        this.panel7.add(computerWinsText);
        
        this.panel6.add(panel5);
        this.panel6.add(panel7);
        
        this.panel4.add(panel);
        this.panel4.add(panel6);

        this.panel2.add(panel4);
        this.panel2.add(button1);

        this.panel3.add(text1);
        this.panel3.add(panel2);

        this.gameWindow.add(this.panel3);

    }


