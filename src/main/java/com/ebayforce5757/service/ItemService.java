package com.ebayforce5757.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ebayforce5757.domain.Item;
import com.ebayforce5757.dto.ItemDTO;
import com.ebayforce5757.dto.ItemSearchDTO;
import com.ebayforce5757.dto.ItemPageDTO;
import com.ebayforce5757.dto.ItemConvertCriteriaDTO;
import com.ebayforce5757.service.GenericService;
import com.ebayforce5757.dto.common.RequestDTO;
import com.ebayforce5757.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ItemService extends GenericService<Item, Integer> {

	List<Item> findAll();

	ResultDTO addItem(ItemDTO itemDTO, RequestDTO requestDTO);

	ResultDTO updateItem(ItemDTO itemDTO, RequestDTO requestDTO);

    Page<Item> getAllItems(Pageable pageable);

    Page<Item> getAllItems(Specification<Item> spec, Pageable pageable);

	ResponseEntity<ItemPageDTO> getItems(ItemSearchDTO itemSearchDTO);
	
	List<ItemDTO> convertItemsToItemDTOs(List<Item> items, ItemConvertCriteriaDTO convertCriteria);

	ItemDTO getItemDTOById(Integer itemId);







}





