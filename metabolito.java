public class metabolito {
    private Formula formulaQuimica;
    private float pesoMolecular;
    private String nombre;

    public metabolito(Formula formulaQuimica, float pesoMolecular, String nombre) {
        this.formulaQuimica = formulaQuimica;
        this.pesoMolecular = pesoMolecular;
        this.nombre = nombre;
    }

    public metabolito(Formula formulaQuimica, float pesoMolecular) {
        this.formulaQuimica = formulaQuimica;
        this.pesoMolecular = pesoMolecular;
    }

    public metabolito(Formula formulaQuimica) {
        this.formulaQuimica = formulaQuimica;
        this.pesoMolecular = calcularPesoMolecular(formulaQuimica);
    }

    private float calcularPesoMolecular(Formula formulaQuimica) {
        // Implement the logic to calculate the molecular weight based on the formula
        // Return the calculated molecular weight
    }
}