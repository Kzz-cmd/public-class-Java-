public class AgenteSaude {
    Paciente paciente;
    public AgenteSaude(Paciente paciente){
        this.paciente = paciente;        
    }
    String checagemTemperatura(){
        if (paciente.temperatura > 37.5){
            return "com Febre";
        } else if (paciente.temperatura < 35){
                return "com Hipotermia";
        }
        else {
                return "Saudável";
        }
    }
}
