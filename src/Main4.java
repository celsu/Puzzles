import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        testArray("Apple", "Banana", "Orange"); // Exemplo de Array: Armazenar frutas
        testLinkedList("Cat", "Dog", "Elephant"); // Exemplo de Listas Ligadas: Animais em uma fila
        testStack("Red", "Green", "Blue"); // Exemplo de Pilhas: Cores em ordem reversa
        testQueue("Monday", "Tuesday", "Wednesday"); // Exemplo de Filas: Dias da semana em ordem
        // testTree("Folder A", "Folder B"); // Uso para estruturas de diretórios
        testHashMap("Key1", "Value1", "Key2", "Value2"); // Exemplo de Tabelas Hash: Associação chave-valor
        // testGraph("Alice", "Bob", "Charlie"); // Uso para redes sociais
        // testMatrix("A", "B", "C"); // Uso para dados tabulares
        testPriorityQueue("High", "Medium", "Low"); // Exemplo de Filas de Prioridade: Priorização de tarefas
        testSet("Apple", "Banana", "Apple"); // Exemplo de Conjuntos: Nomes únicos
    }

    /**
     * Array:
     * - Melhor quando o tamanho é fixo.
     * - Acesso rápido pelo índice.
     * Exemplo de Array: Armazenar frutas.
     */
    public static void testArray(String... elements) {
        System.out.println("Array:");
        String[] arr = new String[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Listas Ligadas:
     * - Boa para inserção e remoção frequentes.
     * - Uso eficiente de memória.
     * Exemplo de Listas Ligadas: Animais em uma fila.
     */
    public static void testLinkedList(String... elements) {
        System.out.println("Linked List:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(elements));
        System.out.println(linkedList);
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
        System.out.println(stack);
    }

    /**
     * Filas:
     * - Útil para controle de tarefas em ordem.
     * - Implementa princípio FIFO (First-In-First-Out).
     * Exemplo de Filas: Dias da semana em ordem.
     */
    public static void testQueue(String... elements) {
        System.out.println("Queue:");
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(elements));
        System.out.println(queue);
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
        System.out.println(hashMap);
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
        System.out.println(priorityQueue);
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
        System.out.println(set);
    }
}
