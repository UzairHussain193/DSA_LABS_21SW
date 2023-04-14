public class Open_Ended_Graph {
    int size;
    String[] vertices;
    boolean[][] a;
    public Open_Ended_Graph(String[]args){
        size=args.length;
        vertices=new String[size];
        System.arraycopy(args,0,vertices,0,size);
        a=new boolean[size][size];
    }
    public void add(String v,String w){
        int i=index(v),j=index(w);
        a[i][j]=a[j][i]=true;
    }
    private int index(String v){
        for(int i=0;i<size;i++)
            if(vertices[i].equals(v))return i;
        return size;
    }

    
    public String toString() {
        if(size==0)return "{}";
        StringBuilder s=new StringBuilder("{ "+vertex(0));
        for(int i=1;i<size;i++)s.append(", ").append(vertex(i));
        return s+" }";
    }
    private String vertex(int i){
        StringBuilder s=new StringBuilder(vertices[i]+" : ");
        for(int j=0;j<size;j++)if(a[i][j])s.append(vertices[j]);
        return s+"";
    }

    public static void main(String[] args) {
        String[] s={"Qasimabad","Wadhuwah Rd","Abdullah Mall Rd","Hyderabad Bypass","Jamshoro","MUET Main Gate"};
        Open_Ended_Graph g=new Open_Ended_Graph(s);
        g.add("Qasimabad","Wadhuwah Rd");
        g.add("Qasimabad","Abdullah Mall Rd");
        g.add("Wadhuwah Rd","Abdullah Mall Rd");
        g.add("Abdullah Mall Rd","Hyderabad Bypass");
        g.add("Hyderabad Bypass","Jamshoro");
        g.add("Jamshoro","MUET Main Gate");
        System.out.println(g);
    }
}
