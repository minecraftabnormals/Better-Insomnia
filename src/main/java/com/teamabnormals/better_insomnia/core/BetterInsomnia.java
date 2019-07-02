package com.betterinsomnia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.betterinsomnia.blocks.BIBlockBedroll;
import com.betterinsomnia.lists.BIBlockList;
import com.betterinsomnia.lists.BIItemList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPotion;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("betterinsomnia")
public class BetterInsomnia {
	
	public static BetterInsomnia instance;
	
	public static final String modid = "betterinsomnia";
	
	private static final Logger logger = LogManager.getLogger(modid);
	
	public BetterInsomnia() {
		
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
		
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			
			event.getRegistry().registerAll(
				
				BIItemList.WHITE_BEDROLL_BLOCK = new ItemBlock(BIBlockList.WHITE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.WHITE_BEDROLL.getRegistryName()),
				BIItemList.ORANGE_BEDROLL_BLOCK = new ItemBlock(BIBlockList.ORANGE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.ORANGE_BEDROLL.getRegistryName()),
				BIItemList.MAGENTA_BEDROLL_BLOCK = new ItemBlock(BIBlockList.MAGENTA_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.MAGENTA_BEDROLL.getRegistryName()),
				BIItemList.LIGHT_BLUE_BEDROLL_BLOCK = new ItemBlock(BIBlockList.LIGHT_BLUE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.LIGHT_BLUE_BEDROLL.getRegistryName()),
				BIItemList.YELLOW_BEDROLL_BLOCK = new ItemBlock(BIBlockList.YELLOW_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.YELLOW_BEDROLL.getRegistryName()),
				BIItemList.LIME_BEDROLL_BLOCK = new ItemBlock(BIBlockList.LIME_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.LIME_BEDROLL.getRegistryName()),
				BIItemList.PINK_BEDROLL_BLOCK = new ItemBlock(BIBlockList.PINK_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.PINK_BEDROLL.getRegistryName()),
				BIItemList.GRAY_BEDROLL_BLOCK = new ItemBlock(BIBlockList.GRAY_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.GRAY_BEDROLL.getRegistryName()),
				BIItemList.LIGHT_GRAY_BEDROLL_BLOCK = new ItemBlock(BIBlockList.LIGHT_GRAY_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.LIGHT_GRAY_BEDROLL.getRegistryName()),
				BIItemList.CYAN_BEDROLL_BLOCK = new ItemBlock(BIBlockList.CYAN_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.CYAN_BEDROLL.getRegistryName()),
				BIItemList.PURPLE_BEDROLL_BLOCK = new ItemBlock(BIBlockList.PURPLE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.PURPLE_BEDROLL.getRegistryName()),
				BIItemList.BLUE_BEDROLL_BLOCK = new ItemBlock(BIBlockList.BLUE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.BLUE_BEDROLL.getRegistryName()),
				BIItemList.BROWN_BEDROLL_BLOCK = new ItemBlock(BIBlockList.BROWN_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.BROWN_BEDROLL.getRegistryName()),
				BIItemList.GREEN_BEDROLL_BLOCK = new ItemBlock(BIBlockList.GREEN_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.GREEN_BEDROLL.getRegistryName()),
				BIItemList.RED_BEDROLL_BLOCK = new ItemBlock(BIBlockList.RED_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.RED_BEDROLL.getRegistryName()),
				BIItemList.BLACK_BEDROLL_BLOCK = new ItemBlock(BIBlockList.BLACK_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BIBlockList.BLACK_BEDROLL.getRegistryName())
				
			);
			
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			
			event.getRegistry().registerAll(
				
				BIBlockList.WHITE_BEDROLL = new BIBlockBedroll(EnumDyeColor.WHITE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("white_bedroll")),
				BIBlockList.ORANGE_BEDROLL = new BIBlockBedroll(EnumDyeColor.ORANGE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("orange_bedroll")),
				BIBlockList.MAGENTA_BEDROLL = new BIBlockBedroll(EnumDyeColor.MAGENTA, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("magenta_bedroll")),
				BIBlockList.LIGHT_BLUE_BEDROLL = new BIBlockBedroll(EnumDyeColor.LIGHT_BLUE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("light_blue_bedroll")),
				BIBlockList.YELLOW_BEDROLL = new BIBlockBedroll(EnumDyeColor.YELLOW, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("yellow_bedroll")),
				BIBlockList.LIME_BEDROLL = new BIBlockBedroll(EnumDyeColor.LIME, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("lime_bedroll")),
				BIBlockList.PINK_BEDROLL = new BIBlockBedroll(EnumDyeColor.PINK, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("pink_bedroll")),
				BIBlockList.GRAY_BEDROLL = new BIBlockBedroll(EnumDyeColor.GRAY, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("gray_bedroll")),
				BIBlockList.LIGHT_GRAY_BEDROLL = new BIBlockBedroll(EnumDyeColor.LIGHT_GRAY, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("light_gray_bedroll")),
				BIBlockList.CYAN_BEDROLL = new BIBlockBedroll(EnumDyeColor.CYAN, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("cyan_bedroll")),
				BIBlockList.PURPLE_BEDROLL = new BIBlockBedroll(EnumDyeColor.PURPLE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("purple_bedroll")),
				BIBlockList.BLUE_BEDROLL = new BIBlockBedroll(EnumDyeColor.BLUE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("blue_bedroll")),
				BIBlockList.BROWN_BEDROLL = new BIBlockBedroll(EnumDyeColor.BROWN, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("brown_bedroll")),
				BIBlockList.GREEN_BEDROLL = new BIBlockBedroll(EnumDyeColor.GREEN, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("green_bedroll")),
				BIBlockList.RED_BEDROLL = new BIBlockBedroll(EnumDyeColor.RED, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("red_bedroll")),
				BIBlockList.BLACK_BEDROLL = new BIBlockBedroll(EnumDyeColor.BLACK, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(location("black_bedroll"))
				
			);
			
		}
		
	}
	
	private static ResourceLocation location(String name) {
		
		return new ResourceLocation(modid, name);
		
	}
	
}
