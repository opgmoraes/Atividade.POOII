

public class AccountService {
    public void createAccount(String username, String email) {
        System.out.println("Conta criada para usuário: " + username + " com e-mail: " + email);
    }
}

public class EmailService {
    public void sendEmailConfirmation(String email) {
        System.out.println("E-mail de confirmação enviado para: " + email);
    }
}

public class LoggerService {
    public void logAccountCreation(String username) {
        System.out.println("Registro: conta criada para o usuário " + username);
    }
}

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        EmailService emailService = new EmailService();
        LoggerService loggerService = new LoggerService();

        String username = "Joao";
        String email = "joao@email.com";

        accountService.createAccount(username, email);
        emailService.sendEmailConfirmation(email);
        loggerService.logAccountCreation(username);
    }
}
