    private void checkAnswer(String name) {

        for (int i = 0; i < data.length; i++) {
            if (currentDiceValue == LOWER && carPrice[i + 1] < rolledNumbers[i]) {
                
            }
        }

        for (int i = 0; i < this.choiceHigherLower.length; i++) {
            if (currentDiceValue == LOWER && carPrice[i + 1] < rolledNumbers[i]) {//guess lower, car cost is lower than roll           
                correctInfo += "col[" + (i + 1) + "]: " + carPrice[i + 1] + " is < " + rolledNumbers[i] + ". ";
                win++;
            } else if (currentDiceValue == LOWER && carPrice[i + 1] > rolledNumbers[digit]) {//guess lower, car cost is HIGHER than roll
                wrongInfo += "col[" + (i + 1) + "]: " + carPrice[i + 1] + " not < " + rolledNumbers[i] + ". ";
            } else if (currentDiceValue == HIGHER && carPrice[i + 1] > rolledNumbers[digit]) {//guess higher, correct
                correctInfo += "col[" + (i + 1) + "]: " + carPrice[i + 1] + " is > " + rolledNumbers[i] + ". ";
                win++;
            } else if (currentDiceValue == HIGHER && carPrice[i + 1] < rolledNumbers[digit]) {//guess lower, wrong
                wrongInfo += "col[" + (i + 1) + "]: " + carPrice[i + 1] + " not > " + rolledNumbers[i] + ". ";
            } else if (rolledNumbers[i] == carPrice[i + 1]) {
                wins++;
            }

        }
        if (wins == 4) {
            output.setText("You have won a " + this.carName);
        } else {
            output.setText("Sorry you didnt win a " + this.carName);
        }
    }

    private void resultCheck(String name) {

        if (currentDiceValue > carPrice[turn - 1]) {
            if (name.equals(upperColName)) {
                output.setText("You Lose");
            } else if (name.equals(lowerColName)) {
                if (lowerColName.equals("e23")) {

                    rollButton.setEnabled(false);
                    output.setText("You Win");
                } else {
                    output.setText("Nice ");
                    rollButton.setEnabled(true);
                    topandbottomPanels[2][turn - 1].add(hiddenClone[turn - 1]);
                }
            }

        } else if (currentDiceValue < carPrice[diceCounter - 1]) {
            if (name.equals(upperColName)) {
                if (upperColName.equals("e03")) {
                    rollButton.setEnabled(false);
                    output.setText("YOU WON THE GAME");
                } else {
                    output.setText("Nice");
                    rollButton.setEnabled(true);
                    topandbottomPanels[0][turn - 1].add(hiddenValue[turn - 1]);
                }
            } else if (name.equals(lowerColName)) {
                output.setText("You Lose ");

            }

        } else {
            output.setText("Click The Button!");
            System.out.println("Click The Button!");
        }
    }

