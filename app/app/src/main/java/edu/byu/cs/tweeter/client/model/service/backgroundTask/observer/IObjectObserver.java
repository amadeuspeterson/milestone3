package edu.byu.cs.tweeter.client.model.service.backgroundTask.observer;

public interface IObjectObserver<T> extends IServiceObserver {
    void handleSuccess(T object);
}
