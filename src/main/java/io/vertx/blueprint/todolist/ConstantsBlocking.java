package io.vertx.blueprint.todolist;

/**
 * Vert.x Blueprint Application - Todo Backend
 * Constants class
 */
public final class ConstantsBlocking {

  private ConstantsBlocking() {}

  /** API Route */
  public static final String API_GET = "/todosb/:todoId";
  public static final String API_LIST_ALL = "/todosb";
  public static final String API_CREATE = "/todosb";
  public static final String API_UPDATE = "/todosb/:todoId";
  public static final String API_DELETE = "/todosb/:todoId";
  public static final String API_DELETE_ALL = "/todosb";

  /** Persistence key */
  public static final String REDIS_TODO_KEY = "VERT_TODO";

}
