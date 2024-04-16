public class Crud {
    protected static void introduceMetabolitos(ArrayList <Metabolitos> arrayMetabolitos) {
        ArrayList<Metabolitos> productos=new ArrayList<>();
        if (arrayMetabolitos!=null){
            productos=arrayMetabolitos;
        }
        String nameExperimento;
        nameExperimento= "Introduce el nombre"; 
        Metabolitos experi= new Metabolitos(++id,nameExperimento,Metabolitos.agregarFormulaQuimica());
        productos.add(experi);
        listarMetabolitos(productos);
        m.menu(productos);
    }




    protected static void listarMetabolitos(ArrayList <Metabolitos> arrayMetabolitos) {
        String prods=new String();
        for(int i=0; i<arrayMetabolitos.size(); i++) {
            prods += arrayMetabolitos.get(i).toString() + "\n";
        }
        System.out.println("Lista de experimentos:"+"\n"+prods); 
        m.menu(arrayMetabolitos);

    }

    protected static void modificarMetabolitos(ArrayList <Metabolitos> arrayMetabolitos) {
        int idamod=Integer.parseInt("Introduce el id del producto a modificar"); 
        int pos=posicion(arrayMetabolitos, idamod);
        arrayMetabolitos.set(pos, new Metabolitos(idamod,"Introduce el nuevo experimento", Metabolitos.agregarFormulaQuimica()));
        listarExperimento(arrayMetabolitos);
        m.menu(arrayMetabolitos);
    }

    protected static void eliminarMetabolitos(ArrayList <Metabolitos> arrayMetabolitos) {
        int idaeliminar=Integer.parseInt("Introduce el id del producto a eliminar");
        int pos=posicion(arrayMetabolitos, idaeliminar);
        arrayMetabolitos.remove(pos);
        listarMetabolitos(arrayMetabolitos);
        m.menu(arrayMetabolitos);

    }

    // Metodo para saber la posicion del ArrayList
    public int posicion(ArrayList<Metabolitos> arrayMetabolitos, int idabuscar){
        int posicion=-1;
        for(int i=0; i<arrayMetabolitos.size(); i++) {
            if(arrayMetabolitos.get(i).getIdE()==idabuscar) {
                posicion=i;

            }
        }
        return posicion;

    }
}
