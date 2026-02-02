public class TesteAgenteSaude {
    public static void main(String[] args) {

        Paciente pacientes[] = {
        new Paciente(60.08, 1.74, 36,"Jonathan"),
        new Paciente(70.0, 1.70, 34.0, "Maria Gelada"),
        new Paciente(65.0, 1.65, 36.5, "José Saudável")};


        for(Paciente p : pacientes){

            AgenteSaude as = new AgenteSaude(p);
            p.exibirPaciente();
            System.out.printf("%s está %s\n\n",p.nome,as.checagemTemperatura());

        }
    }
}
