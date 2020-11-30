package com.barco.model.util;

import com.barco.model.dto.PaggingDto;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
/**
 *
 * @author Adeel.Asghar
 */
public class PaggingUtil {

    private static final Long DEFAULT_PAGE_NUMBER = 0l;
    private static final Long DEFAULT_MAX_NO_OF_ROWS  = 10l;
    
    public static Object convertEntityToPaggingDTO(Long totalCount, Pageable page) {
        PaggingDto pdto = new PaggingDto();
        pdto.setPageSize(new Long(page.getPageSize()));
        pdto.setCurrentPage(new Long(page.getPageNumber() +1) );
        pdto.setTotalRecord(totalCount);
        return pdto;
    }
       
    public static Object convertEntityToPaggingDTO(Long totalCount, Pageable page, PaggingDto pageDTO) {
        PaggingDto  pdto = null;
        if(pageDTO == null) {
            pdto = new PaggingDto();
        } else {
            pdto = pageDTO;
        }
        pdto.setPageSize(new Long(page.getPageSize()));
        pdto.setCurrentPage(new Long(page.getPageNumber() +1) );
        pdto.setTotalRecord(totalCount);
        return pdto;
    }
    
    /* Page = current page And size is Limit*/
    public static PaggingDto ApplyPagging(Long page, Long limit, String orderBy, String columnName) {
        return ApplyPaggingAndSorting(orderBy,columnName, page != null ? page -1 : 0l , limit);
    }

    /* Apply If Needed */
    public static PaggingDto ApplyPaggingAndSorting(String orderBy, String columnName, Long page, Long limit) {
        PaggingDto  pdto = new PaggingDto();
        pdto.setColumnName(columnName);
        if (orderBy.equals("ASC")) {
            pdto.setOrder(orderBy);
        } else {
            pdto.setOrder(orderBy);
        }

        if(page == null) {
            page = DEFAULT_PAGE_NUMBER;
        }
        if(limit == null) {
            limit = DEFAULT_MAX_NO_OF_ROWS ;
        }
        pdto.setPageSize(limit);
        pdto.setCurrentPage(page + 1);
        return pdto;
    }
    
}
