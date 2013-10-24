import grails.test.Book
class BootStrap {

    def init = { servletContext ->
        if (!Book.count()) {
            new Book(title: "Stephen King", description: "The Shining").save(failOnError: true)
            new Book(title: "James Patterson", description: "Along Came a Spider").save(failOnError: true)
        }
    }
    def destroy = {
    }
}
