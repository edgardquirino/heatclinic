package com.community.core.service.search;

import org.broadleafcommerce.common.exception.ServiceException;

import java.io.IOException;

public interface SolrIndexCleanupService {

    void rebuildIndexAtStartupIfNecessary() throws ServiceException, IOException;

}