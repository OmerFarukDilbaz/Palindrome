        Scanner input = new Scanner(System.in);
        int low = 0;
        String s = input.nextLine();
        int high = s.length() - 1;

        boolean isPalimdrome = true;
        while (low < high){
            if(s.charAt(low) != s.charAt(high)) {
                isPalimdrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalimdrome)
            System.out.println("This is a palindrome");
        else
            System.out.println("This is a not palindrome");
