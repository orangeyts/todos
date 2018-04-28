package io.vertx.blueprint.todolist;

import io.vertx.blueprint.todolist.verticles.TodoVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Runner for the vertx-spring sample
 *
 */
public class VertXRunner {

  static Logger logger = LoggerFactory.getLogger(VertXRunner.class);

  public static void main( String[] args ) {
//    System.setProperty("vertx.logger-delegate-factory-class-name", "io.vertx.core.logging.SLF4JLogDelegateFactory"); 导致看不到redis异常
//    VertxOptions vo = new VertxOptions();
//    vo.setEventLoopPoolSize(16);
    final Vertx vertx = Vertx.vertx();
    DeploymentOptions options = new DeploymentOptions().setWorker(false).setMultiThreaded(false).setInstances(4).setWorkerPoolSize(360).setWorkerPoolName("spring-service-work");
    vertx.deployVerticle(TodoVerticle.class.getName(),options);
    logger.info("Deployment done");
  }

}
