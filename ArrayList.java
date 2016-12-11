// read in the data
ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
Scanner input = new Scanner(new File("src/array.txt"));
while(input.hasNextLine())
{
    Scanner colReader = new Scanner(input.nextLine());
    ArrayList col = new ArrayList();
    while(colReader.hasNextInt())
    {
        col.add(colReader.nextInt());
    }
    a.add(col);
}