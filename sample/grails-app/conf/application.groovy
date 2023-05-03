hibernate {
    cache.use_second_level_cache = false
    cache.use_query_cache = false
    jdbc.batch_size=50
    //    cache.region.factory_class = 'org.hibernate.cache.SingletonEhCacheRegionFactory' // Hibernate 3
    //cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    //flush.mode = 'manual' // OSIV session flush mode outside of transactional context
    globally_quoted_identifiers=true
    hibernateDirtyChecking = true
    allow_update_outside_transaction = true
    allowUpdateOutsideTransaction = true
}
dataSource.transactional = true