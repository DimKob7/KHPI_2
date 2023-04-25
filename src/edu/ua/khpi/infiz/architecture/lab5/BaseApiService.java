package edu.ua.khpi.infiz.architecture.lab5;

abstract class   BaseApiService {
    protected abstract void validate(BaseEntity entity);
    protected abstract void save(BaseEntity entity);
    protected abstract void notifyAdmin(BaseEntity entity);

    public void update(BaseEntity entity) {
        validate(entity);
        save(entity);
    }
}
