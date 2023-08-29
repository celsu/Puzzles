import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        testArray("Apple", "Banana", "Orange"); // Exemplo de Array: Armazenar frutas
        testLinkedList("Cat", "Dog", "Elephant"); // Exemplo de Listas Ligadas: Animais em uma fila
        testStack("Enter building", "Take elevator", "Reach top floor"); // Exemplo de Pilhas: Rotina para chegar ao topo do prédio
        testQueue("Order placed", "Payment received", "Preparing your meal"); // Exemplo de Filas: Processo de pedido de comida
        testHashMap("Username", "JohnDoe", "Password", "Secret123"); // Exemplo de Tabelas Hash: Armazenamento seguro de informações
        testPriorityQueue("High priority task", "Medium priority task", "Low priority task"); // Exemplo de Filas de Prioridade: Organização de tarefas
        testSet("Apple", "Banana", "Apple"); // Exemplo de Conjuntos: Armazenamento de frutas únicas
    }

    /**
     * Array:
     * - Melhor quando o tamanho é fixo.
     * - Acesso rápido pelo índice.
     * Exemplo de Array: Armazenar frutas.
     */
    public static void testArray(String... elements) {
        System.out.println("Array:");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(elements));

        System.out.println("Original: " + arrayList);
        arrayList.add("Grapes"); // Adicionando nova fruta
        arrayList.remove("Banana"); // Removendo fruta existente
        System.out.println("Updated: " + arrayList);
    }

    /**
     * Listas Ligadas: LinkedList
     * - Boa para inserção e remoção frequentes.
     * - Uso eficiente de memória.
     * Exemplo de Listas Ligadas: Animais em uma fila.
     */
    public static void testLinkedList(String... elements) {
        System.out.println("Linked List:");
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(elements));

        System.out.println("Original: " + linkedList);
        linkedList.addFirst("Giraffe"); // Adicionando animal na frente
        linkedList.removeLast(); // Removendo último animal
        System.out.println("Updated: " + linkedList);
    }

    /**
     * Pilhas:
     * - Útil para controle de chamadas/recursões.
     * - Implementa princípio LIFO (Last-In-First-Out).
     * Exemplo de Pilhas: Cores em ordem reversa.
     */
    public static void testStack(String... elements) {
        System.out.println("Stack:");
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(elements));

        System.out.println("Original: " + stack);
        stack.push("Take stairs"); // Adicionando etapa
        stack.pop(); // Removendo etapa concluída
        System.out.println("Updated: " + stack);
    }

    /**
     * Filas:
     * - Útil para controle de tarefas em ordem.
     * - Implementa princípio FIFO (First-In-First-Out).
     * Exemplo de Filas: Dias da semana em ordem.
     */
    public static void testQueue(String... elements) {
        System.out.println("Queue:");
        Queue<String> queue = new LinkedList<>(Arrays.asList(elements));

        System.out.println("Original: " + queue);
        queue.offer("Cooking meal"); // Adicionando etapa de cozimento
        queue.poll(); // Removendo etapa concluída
        System.out.println("Updated: " + queue);
    }

    /**
     * Árvores:
     * - Use para estruturas hierárquicas, como diretórios.
     * - Implementação específica depende da necessidade.
     */
    // public static void testTree(String... elements) {
    //     System.out.println("Tree:");
    //     // Implement tree structure and operations here
    // }

    /**
     * Tabelas Hash:
     * - Rápida busca e inserção.
     * - Associação chave-valor.
     * Exemplo de Tabelas Hash: Associação chave-valor.
     */
    public static void testHashMap(String... elements) {
        System.out.println("Hash Map:");
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < elements.length; i += 2) {
            hashMap.put(elements[i], elements[i + 1]);
        }

        System.out.println("Original: " + hashMap);
        hashMap.put("Email", "john@example.com"); // Atualizando email
        hashMap.remove("Password"); // Removendo senha
        System.out.println("Username:"+hashMap.get("Username"));
        System.out.println("Updated: " + hashMap);
    }

    /**
     * Grafos:
     * - Use para modelar relações complexas.
     * - Implementação específica depende da necessidade.
     */
    // public static void testGraph(String... elements) {
    //     System.out.println("Graph:");
    //     // Implement graph structure and operations here
    // }

    /**
     * Matrizes:
     * - Use para representar dados tabulares.
     * - Implementação específica depende da necessidade.
     */
    // public static void testMatrix(String... elements) {
    //     System.out.println("Matrix:");
    //     // Implement matrix structure and operations here
    // }

    /**
     * Filas de Prioridade:
     * - Processamento por prioridade.
     * - Elemento de maior prioridade é retirado primeiro.
     * Exemplo de Filas de Prioridade: Priorização de tarefas.
     */
    public static void testPriorityQueue(String... elements) {
        System.out.println("Priority Queue:");
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Arrays.asList(elements));

        System.out.println("Original: " + priorityQueue);
        priorityQueue.add("Urgent task"); // Adicionando tarefa urgente
        priorityQueue.poll(); // Concluindo tarefa prioritária
        System.out.println("Updated: " + priorityQueue);
    }

    /**
     * Conjuntos:
     * - Armazenamento de elementos únicos.
     * - Não mantém ordem específica.
     * Exemplo de Conjuntos: Nomes únicos.
     */
    public static void testSet(String... elements) {
        System.out.println("Set:");
        Set<String> set = new HashSet<>(Arrays.asList(elements));

        System.out.println("Original: " + set);
        set.add("Apple"); // Tentando adicionar fruta repetida
        set.remove("Banana"); // Removendo fruta
        System.out.println("Updated: " + set);
    }
}
