package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    /**
     *
     * @param args
     * Descripción: Aquí empieza la construcción del sistema y del menú
     * Primero se instancian los objetos suficientes de cada una de las
     * clases esenciales, y luego se relacionan entre sí. s0 es el
     * sistema que será utilizado para la ejecución del programa.
     */
    public static void main(String[] args) {

        Option_22594262_AlMarzuk op1 = new Option_22594262_AlMarzuk(1, "1) Jugar", 1, 1, Arrays.asList("entretenerme", "jugar", "ocio"));
        Option_22594262_AlMarzuk op2 = new Option_22594262_AlMarzuk(2, "2) Trabajar", 2, 1, Arrays.asList("trabajo", "chamba", "productividad"));

        Flow_22594262_AlMarzuk f10 = new Flow_22594262_AlMarzuk(1, "Flujo Principal", Arrays.asList(op1, op2));


        Chatbot_22594262_AlMarzuk cb0 = new Chatbot_22594262_AlMarzuk(0, "Chatbot Principal", "Bienvenido\n¿Qué planeas hacer?", 1, Arrays.asList(f10));


        Option_22594262_AlMarzuk op3 = new Option_22594262_AlMarzuk(1, "1) Minecraft", 1, 2, Arrays.asList("minecraft", "mc", "cubos"));
        Option_22594262_AlMarzuk op4 = new Option_22594262_AlMarzuk(2, "2) Fortnite", 1, 2, Arrays.asList("fortnite", "battle royale"));
        Option_22594262_AlMarzuk op5 = new Option_22594262_AlMarzuk(3, "3) Stardew Valley", 1, 2, Arrays.asList("granja", "stardew", "stardew valley"));
        Option_22594262_AlMarzuk op6 = new Option_22594262_AlMarzuk(4, "4) No quiero jugar", 0, 1, Arrays.asList("regresar", "volver", "atras", "nada"));

        Flow_22594262_AlMarzuk f20 = new Flow_22594262_AlMarzuk(1, "\nFlujo1 Chatbot1\n¿Qué Quieres Jugar?", Arrays.asList(op3, op4, op5, op6));

        Option_22594262_AlMarzuk op7 = new Option_22594262_AlMarzuk(1, "1) Solo", 1, 3, Arrays.asList("solitario", "singleplayer", "solo"));
        Option_22594262_AlMarzuk op8 = new Option_22594262_AlMarzuk(2, "2) Duos", 1, 3, Arrays.asList("parejas", "duos"));
        Option_22594262_AlMarzuk op9 = new Option_22594262_AlMarzuk(3, "3) Grupos", 1, 3, Arrays.asList("grupo", "squad", "varios"));
        Option_22594262_AlMarzuk op10 = new Option_22594262_AlMarzuk(4, "4) Volver", 1, 1, Arrays.asList("atras", "volver", "otro"));

        Flow_22594262_AlMarzuk f21 = new Flow_22594262_AlMarzuk(2, "\nFlujo 2 Chatbot 1\n¿Qué modalidad quieres jugar?", Arrays.asList(op7, op8, op9, op10));

        Option_22594262_AlMarzuk op11 = new Option_22594262_AlMarzuk(1, "1) Epic Store", 1, 3, Arrays.asList("solo", "solitario", "con nadie"));
        Option_22594262_AlMarzuk op12 = new Option_22594262_AlMarzuk(2, "2) Steam", 1, 3, Arrays.asList("pareja", "dos", "duo"));
        Option_22594262_AlMarzuk op13 = new Option_22594262_AlMarzuk(3, "3) Origin", 1, 3, Arrays.asList("familia", "grupo", "hartos"));
        Option_22594262_AlMarzuk op14 = new Option_22594262_AlMarzuk(4, "4) Microsoft Store", 1, 3, Arrays.asList("atractivos", "mas atractivos", "agregar atractivos"));
        Option_22594262_AlMarzuk op15 = new Option_22594262_AlMarzuk(5, "5) Quiero jugar otra cosa", 1, 2, Arrays.asList("atras", "regresar", "volver"));

        Flow_22594262_AlMarzuk f22 = new Flow_22594262_AlMarzuk(3, "\nFlujo 3 Chatbot1\n¿En qué plataforma quieres jugar?", Arrays.asList(op11, op12, op13, op14, op15));

        Chatbot_22594262_AlMarzuk cb1 = new Chatbot_22594262_AlMarzuk(1, "Chatbot de Ocio", "Bienvenido\n¿Qué vas a jugar?", 1, Arrays.asList(f20, f21, f22));



        Option_22594262_AlMarzuk op16 = new Option_22594262_AlMarzuk(1, "1) Taxista", 2, 3, Arrays.asList("taxi", "manejar", "auto", "taxista"));
        Option_22594262_AlMarzuk op17 = new Option_22594262_AlMarzuk(2, "2) Veterinario", 2, 3, Arrays.asList("animales", "veterinario"));
        Option_22594262_AlMarzuk op18 = new Option_22594262_AlMarzuk(3, "3) Periodista", 2, 3, Arrays.asList("periodista", "periodismo"));
        Option_22594262_AlMarzuk op19 = new Option_22594262_AlMarzuk(4, "4) Más trabajos", 2, 2, Arrays.asList("mas", "mas trabajos"));
        Option_22594262_AlMarzuk op20 = new Option_22594262_AlMarzuk(5, "5) No quiero trabajar", 0, 1, Arrays.asList("atras", "ninguno", "volver"));

        Option_22594262_AlMarzuk op21 = new Option_22594262_AlMarzuk(1, "1) Conserje", 2, 3, Arrays.asList("conserje", "limpiar"));
        Option_22594262_AlMarzuk op22 = new Option_22594262_AlMarzuk(2, "2) Actor", 2, 3, Arrays.asList("actuacion", "actor", "actuar"));
        Option_22594262_AlMarzuk op23 = new Option_22594262_AlMarzuk(3, "3) Cantante", 2, 3, Arrays.asList("cantar", "cantante"));
        Option_22594262_AlMarzuk op24 = new Option_22594262_AlMarzuk(4, "4) Trabajos Anteriores", 2, 1, Arrays.asList("trabajos anteriores", "mas trabajos"));

        Option_22594262_AlMarzuk op25 = new Option_22594262_AlMarzuk(1, "1) Chile", 2, 3, Arrays.asList("chile", "aqui"));
        Option_22594262_AlMarzuk op26 = new Option_22594262_AlMarzuk(2, "2) Perú", 2, 3, Arrays.asList("peru", "perú"));
        Option_22594262_AlMarzuk op27 = new Option_22594262_AlMarzuk(3, "3) Panamá", 2, 3, Arrays.asList("panama", "panamá"));
        Option_22594262_AlMarzuk op28 = new Option_22594262_AlMarzuk(4, "4) Volver", 2, 2, Arrays.asList("atras", "volver", "atrás"));

        Flow_22594262_AlMarzuk f30 = new Flow_22594262_AlMarzuk(1, "\nFlow 1 Chatbot 2\n¿Qué quieres trabajar?", Arrays.asList(op16, op17, op18, op19, op20));
        Flow_22594262_AlMarzuk f31 = new Flow_22594262_AlMarzuk(2, "\nFlow 2, Chatbot 2\n¿Qué quieres trabajar?", Arrays.asList(op21, op22, op23, op24, op20));
        Flow_22594262_AlMarzuk f32 = new Flow_22594262_AlMarzuk(3, "Flow 3 Chatbot 2\n¿Dónde te gustaría ejercer?", Arrays.asList(op25, op26, op27, op28));

        Chatbot_22594262_AlMarzuk cb2 = new Chatbot_22594262_AlMarzuk(2, "Orientador Académico", "Bienvenido\n¿Qué deseas estudiar?", 1, Arrays.asList(f30, f31, f32));

        Sistem_22594262_AlMarzuk s0 = new Sistem_22594262_AlMarzuk("Chatbots Paradik", 0, Arrays.asList(cb0, cb1, cb2));

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\n\n\n");

        //Aquí comienza la ejecución del menú, este se ejecutará infinitamente hasta que el usuario
        //le diga que pare
        while(true) {
            System.out.println("### Sistema de Chatbots ###\nIntroduzca el numero de su opción\n1) Iniciar sesión\n2) Registrarse\n3) Terminar ejecución");
            int choice = input.nextInt();

            if(choice == 3){
                break;
            }
            //primer menú de elección, para registrarse o para iniciar sesión con un usuario registrado
            switch (choice) {
                case 1:
                    System.out.println("### Inicio de sesión ###\nIngresa tu nombre de usuario");
                    String username = input.next();
                    s0.systemLogin(username);
                    break;
                case 2:
                    System.out.println("\n\n\n### Registro de usuario ###\n1) Registrar Usuario Administrador\n2) Registrar Usuario Normal");
                    int registro = input.nextInt();
                    switch (registro) {
                        case 1:
                            System.out.println("\n\nIngresa tu nombre de usuario");
                            String name = input.next();
                            User_22594262_AlMarzuk user = new User_22594262_AlMarzuk(name);
                            user.setAdmin();
                            s0.systemAddUser(user);
                            break;
                        case 2:
                            System.out.println("\n\nIngresa tu nombre de usuario");
                            name = input.next();
                            user = new User_22594262_AlMarzuk(name);
                            s0.systemAddUser(user);
                            break;
                        default:
                            System.out.println("\n############################\n¡Ingresa una opción válida!\n############################\n");
                    }
                    break;
                default:
                    System.out.println("\n############################\n¡Ingresa una opción válida!\n############################\n");
            }
            //Este while se activará solo si el usuario está loggeado en el sistema
            //Cuando se loggee, se activará un menú distinto dependiendo de si es admin
            //o si no lo es.
                while(!s0.systemGetLoggedUser().isEmpty()){
                    if(s0.systemGetLoggedUser().get(0).userIsAdmin()) {
                        String username = s0.systemGetLoggedUser().get(0).getUsername();
                        System.out.println("### Bienvenido " + username + ", usted es administrador ###\n¿Qué desea hacer?\n1) Crear Chatbot y agregar al sistema\n2) Manipular Chatbots del sistema\n3) Hablar con un chatbot\n4) Ver historial de un usuario\n5) Ver todos los chatbots, flujos y opciones\n6) Cerrar sesión");
                        choice = input.nextInt();
                        switch (choice){
                            case 1:
                                try {
                                    System.out.println("Ingresa el id del chatbot");
                                    int cbID = input.nextInt();

                                    System.out.println("Ingresa el nombre del chatbot (Sin espacios)");
                                    String cbName = input.next();

                                    System.out.println("Ingresa el mensaje de bienvenida del chatbot (Sin espacios)");
                                    String cbMsg = input.next();

                                    System.out.println("Ingresa el id del flujo del chatbot");
                                    int flowID = input.nextInt();

                                    Chatbot_22594262_AlMarzuk chatbot = new Chatbot_22594262_AlMarzuk(cbID, cbName, cbName, flowID, Arrays.asList());
                                    s0.systemAddChatbot(chatbot);
                                    System.out.println("El chatbot ha sido creado y añadido al sistema");
                                }catch (InputMismatchException e) {
                                    System.out.println("Error: El ID del chatbot debe ser un número entero.");
                                }catch (Exception e) {
                                    System.out.println("Error al procesar la entrada. Asegúrate de ingresar datos válidos.");
                                }
                                break;

                            case 2:
                                List<Integer> listaSystemIDs = new ArrayList<>();
                                for (int i = 0; i < s0.systemGetChatbots().size(); i++){
                                    listaSystemIDs.add(s0.systemGetChatbots().get(i).chatbotGetID());
                                }
                                System.out.println("El sistema tiene los siguientes ID de chatbot: " + listaSystemIDs);

                                System.out.println("### Modificar chatbots del sistema ###\n¿Qué desea hacer?\n1) Eliminar chatbot\n2) Modificar un chatbot\n3) Volver");
                                int caso = input.nextInt();
                                switch (caso){
                                    case 1:
                                        System.out.println("Ingresa el id del chatbot a eliminar");
                                        int id = input.nextInt();
                                        s0.deleteChatbot(id);
                                        break;

                                    case 2:
                                        System.out.println("Ingresa el id del chatbot a modificar");
                                        id = input.nextInt();
                                        Chatbot_22594262_AlMarzuk chatbot = s0.systemFindChatbot(id);
                                        List<Integer> chatbotElegidoIDs = new ArrayList<>();
                                        for(int j = 0; j < chatbot.chatbotGetFlows().size(); j++){
                                            chatbotElegidoIDs.add(chatbot.chatbotGetFlows().get(j).flowGetID());
                                        }
                                        System.out.println("Los id de los flujos dentro del chatbot elegido son: " + chatbotElegidoIDs +"\n");
                                        System.out.println("Ingresa la operación a realizar\n1) Crear y agregar flujo\n2) Modificar flujo\n3) Eliminar flujo\n4) Volver");
                                        caso = input.nextInt();

                                        //Aquí empieza la modificación de flows dentro de un chatbot

                                        switch (caso){
                                            case 1:
                                                try {
                                                    System.out.println("Ingresa el ID del flujo");
                                                    int flowID = input.nextInt();
                                                    System.out.println("Ingresa el nombre del flujo (Sin espacios)");
                                                    String flowName = input.next();
                                                    Flow_22594262_AlMarzuk flow = new Flow_22594262_AlMarzuk(flowID, flowName, Arrays.asList());
                                                    chatbot.chatbotAddFlow(flow);
                                                    System.out.println("Se agregó el flow creado al chatbot");
                                                }catch (InputMismatchException e){
                                                    System.out.println("Asegurate de ingresar correctamente los tipos de dato");
                                                }catch (Exception e) {
                                                    System.out.println("Error al procesar la entrada. Asegúrate de ingresar datos válidos.");
                                                }
                                                break;

                                            case 2:
                                                System.out.println("Ingresa el ID del flujo a modificar");
                                                int flowID = input.nextInt();
                                                Flow_22594262_AlMarzuk flowMod = chatbot.chatbotFindFlow(flowID);
                                                List<Integer> flowListIDs = new ArrayList<>();
                                                for(int k = 0; k < flowMod.flowGetOptions().size(); k++){
                                                    flowListIDs.add(flowMod.flowGetOptions().get(k).optionGetID());
                                                }
                                                System.out.println("Los IDs de las opciones en el flujo " + flowID + " son: " + flowListIDs + "\n");
                                                System.out.println("Ingresa la operación a realizar\n1) Crear y agregar opción\n2) Eliminar opción\n3) Agregar keywords a una opción\n4) Volver");
                                                int eleccion = input.nextInt();
                                                switch (eleccion){
                                                    case 1:
                                                        try {
                                                            System.out.println("Ingresa el ID de la opción a crear");
                                                            int optionID = input.nextInt();
                                                            System.out.println("Ingresa el nombre de la opción a crear (Sin espacios)");
                                                            String optionName = input.next();
                                                            System.out.println("Ingresa el ID del chatbot asociado a la opción");
                                                            int opChatbotID = input.nextInt();
                                                            System.out.println("Ingresa el ID del flujo asociado a la opción");
                                                            int opFlowID = input.nextInt();
                                                            Option_22594262_AlMarzuk option = new Option_22594262_AlMarzuk(optionID, optionName, opChatbotID, opFlowID, Arrays.asList());
                                                            flowMod.flowAddOption(option);
                                                        }catch (InputMismatchException e){
                                                            System.out.println("Asegurate de ingresar correctamente los tipos de dato");
                                                        }catch (Exception e) {
                                                            System.out.println("Error al procesar la entrada. Asegúrate de ingresar datos válidos.");
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingresa el ID de la opción a eliminar");
                                                        int optionID = input.nextInt();
                                                        flowMod.deleteOption(optionID);
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingresa el ID de la opción a modificar");
                                                        int opID = input.nextInt();
                                                        System.out.println("Ingresa la palabra clave a agregar (en minúsculas)");
                                                        String kw = input.next();


                                                        break;

                                                    case 4:
                                                        break;
                                                    default:
                                                        System.out.println("\n############################\n¡Ingresa una opción válida!\n############################\n");
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Ingresa el ID del flujo a eliminar");
                                                flowID = input.nextInt();
                                                chatbot.deleteFlow(flowID);
                                                break;

                                            case 4:
                                                break;
                                            default:
                                                System.out.println("\n############################\n¡Ingresa una opción válida!\n############################\n");
                                        }
                                        break;

                                    case 3:
                                        break;

                                    default:
                                        System.out.println("\n############################\n¡Ingresa una opción válida!\n############################\n");
                                }
                                break;

                            case 3:
                                System.out.println("Escribe aquí tu mensaje");
                                String mensaje = input.next();
                                s0.systemTalk(mensaje);
                                break;

                            case 4:
                                System.out.println("Escribe el nombre del usuario del que quieres ver el historial");
                                String user = input.next();
                                s0.systemSynthesis(user);
                                break;

                            case 5:
                                System.out.println("\nNombre del sistema: " + s0.systemGetName());
                                System.out.println("\nID chatbot inicial: " + s0.systemGetCbID());
                                System.out.printf("\nUsuarios Registrados: ");
                                String registrados = "";
                                for(int j = 0; j < s0.systemGetRegistered().size(); j++){
                                    registrados = registrados + s0.systemGetRegistered().get(j).getUsername() + ", ";
                                }
                                System.out.println(registrados);

                                if(s0.systemGetLoggedUser().isEmpty()){
                                    System.out.println("\nNo hay usuarios loggeados\n\n");
                                }else{
                                    System.out.println("\nEl usuario loggeado es: " + s0.systemGetLoggedUser().get(0).getUsername());
                                }


                                System.out.println("\nChatbots del sistema: ");
                                for(int i = 0; i < s0.systemGetChatbots().size(); i++){
                                    Chatbot_22594262_AlMarzuk chatbot = s0.systemGetChatbots().get(i);
                                    System.out.println("\nID del Chatbot " + i + ": " + chatbot.chatbotGetID());
                                    System.out.println("\nNombre Chatbot " + i + ": " + chatbot.chatbotGetName());
                                    System.out.println("\nMensaje Chatbot " + i + ": " + chatbot.chatbotGetMsg());
                                    System.out.println("\nFlow inicial Chatbot " + i + ": " + chatbot.chatbotGetFlowID());
                                    System.out.println("\nFlows del chatbot " + i + ": ");
                                    for(int j = 0; j < chatbot.chatbotGetFlows().size(); j++){
                                        Flow_22594262_AlMarzuk flow = chatbot.chatbotGetFlows().get(j);
                                        System.out.println("\nID del Flow " + j + ": " + flow.flowGetID());
                                        System.out.println("\nNombre del Flow " + j + ": " + flow.flowGetName());
                                        System.out.println("\nOpciones del Flow " + j + ": ");
                                        for(int k = 0; k < flow.flowGetOptions().size(); k++){
                                            Option_22594262_AlMarzuk option = flow.flowGetOptions().get(k);
                                            System.out.println("\nID opcion " + k + ": " + option.optionGetID());
                                            System.out.println("\nNombre opcion " + k + ": " + option.optionGetMsg());
                                            System.out.println("\nPalabras clave opcion " + k + ": " + option.optionGetKeywords());
                                        }
                                    }
                                }
                                break;

                            case 6:
                                s0.systemLogout();
                                break;

                            default:
                                System.out.println("\n############################\n¡Ingresa una opción válida!\n############################\n");
                        }

                    }else{
                        String username = s0.systemGetLoggedUser().get(0).getUsername();
                        System.out.println("### Bienvenido " + username + ", usted es usuario comun ###\n¿Qué desea hacer?\n1) Hablar con un chatbot\n2) Ver mi historial\n3) Cerrar sesión");
                        choice = input.nextInt();
                        switch (choice){
                            case 1:
                                System.out.println("Escribe aquí tu mensaje");
                                String mensaje = input.next();
                                s0.systemTalk(mensaje);
                                break;

                            case 2:
                                s0.systemSynthesis(s0.systemGetLoggedUser().get(0).getUsername());
                                break;

                            case 3:
                                s0.systemLogout();
                                System.out.println("Se ha cerrado la sesion");
                                break;

                            default:
                                System.out.println("\n############################\n¡Ingresa una opción válida!\n############################\n");
                        }
                    }
                }
        }
    }
}