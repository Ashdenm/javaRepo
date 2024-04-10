public class JavaVar {
    
    public static void main(String[] args) throws Exception {
        //datatype varNme [=value];
        int games = 3;
        double allowance = 40.50;
        long battlepass; // We define battlepass
        battlepass = 15; // we assign a value to battlepass
        int bpamount = 0; // how many battlepasses we have currently
        long totalbpcost; //define var total battlepass cost

        //print out our variable values along with a string that explains our values
        System.out.println(" ");
        System.out.println("Number of games I own = " + games);
        System.out.println("My monthly allowance = " + allowance);
        System.out.println("Cost of a single battlepass = " + battlepass);
        System.out.println("Number of battlepasses I own: "+ bpamount);

        // what is the total cost of battle passes if we wanted to have one for each game?

        totalbpcost = games*battlepass; //total cost of battlepasses = # of games * cost of one pass;
        System.out.println("The total cost for a battlepass for each game is: " + totalbpcost); //print(total cost of battlepasses for each game);

        //with our current allowance, how many battle passes will we be able to buy?

        while (allowance > battlepass) {
            allowance = allowance - battlepass; //new allowance = old allowance - cost of pass;
            bpamount++; //increase amount of passes owned by 1;
        }
        System.out.println("Number of battlepasses I can purchase: "+ bpamount); //print(# of passes i can buy);
        System.out.println("Remaining allowance afterwards: " + allowance); //print(how much allowance i have after buying as many passes as i can);
    }
}