package com.tjoeun.shop.dto;

import org.modelmapper.ModelMapper;

import com.tjoeun.shop.entity.ItemImage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemImageDto {
	private Long id;
	private String imageName;
	private String originalImageName;
	private String imageUrl;
	private String representativeImage;
	
	private static ModelMapper modelMapper = new ModelMapper();
	
	// parameter     return값
	// Entity   -->  DTO        (DTO --> Entity)
	public static ItemImageDto entityToDto(ItemImage itemImage) {
		ItemImageDto itemImageDto = modelMapper.map(itemImage, ItemImageDto.class);
		return itemImageDto;
	}
	
	
}




