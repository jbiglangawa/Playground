package com.swingspringer.practice.Playground.designpatterns.structural.proxy;

import com.swingspringer.practice.Playground.designpatterns.structural.flyweight.Transaction;

// Proxies have a bunch of uses, but it usually involves a service wrapped in a proxy class:
public class TransactionServiceProxy {
    private TransactionService transactionService;

    /**
     * 1. Lazy initializing the service - Only initialize the service when needed
     */
    private void lazyInitialize() {
        if(transactionService == null) {
            transactionService = new TransactionService();
        }
    }

    /**
     * 2. Access Control - Private/Public your method to allow/restrict access
     */
    private void createVeryImportantTransaction() {
        // transactionService.createVeryImportantTransaction()
    }

    /**
     * 3. Local execution of a remote service - If your service
     * isn't part of this backend (e.g. the service lives on the microservice cluster
     * but lives on a different microservice) this part of the method could also
     * service in the proxy usage.
     * 4. Logging information before sending it over to the service: usually for
     * track-logging
     */
    public Transaction createShopifyTransaction() {
        // Transaction transaction = shopifyClient.createTransaction()
        // log.info("Transaction Created: {}", transaction);
        return new Transaction();
    }

    /**
     * 5. Cache the results as needed: If the transaction requires a huge amount of work,
     * cache it using a proxy so you don't have to fetch twice
     */
    public Transaction getTransactions(Long pageSize, Long pageNumber) {
        // if(cache.size() > 10) or something
        //      redis.get(top 10)
        return new Transaction();
    }

    /**
     * 6. Smart Reference: Close the service if the number of clients are 0
     */
    public void close() {
        // if(subscribers.size() == 0) {
        //      service.close();
        // }
    }
}
