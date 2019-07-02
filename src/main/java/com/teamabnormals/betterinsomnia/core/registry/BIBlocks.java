package com.teamabnormals.betterinsomnia.core.registry;

import com.teamabnormals.betterinsomnia.common.blocks.BIBlockBedroll;
import com.teamabnormals.betterinsomnia.core.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import static com.teamabnormals.betterinsomnia.core.BetterInsomnia.getResourceLocation;

@SuppressWarnings("WeakerAccess")
@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BIBlocks {

    public static Block WHITE_BEDROLL = new BIBlockBedroll(EnumDyeColor.WHITE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("white_bedroll"));
    public static Block ORANGE_BEDROLL = new BIBlockBedroll(EnumDyeColor.ORANGE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("orange_bedroll"));
    public static Block MAGENTA_BEDROLL = new BIBlockBedroll(EnumDyeColor.MAGENTA, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("magenta_bedroll"));
    public static Block LIGHT_BLUE_BEDROLL = new BIBlockBedroll(EnumDyeColor.LIGHT_BLUE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("light_blue_bedroll"));
    public static Block YELLOW_BEDROLL = new BIBlockBedroll(EnumDyeColor.YELLOW, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("yellow_bedroll"));
    public static Block LIME_BEDROLL = new BIBlockBedroll(EnumDyeColor.LIME, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("lime_bedroll"));
    public static Block PINK_BEDROLL = new BIBlockBedroll(EnumDyeColor.PINK, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("pink_bedroll"));
    public static Block GRAY_BEDROLL = new BIBlockBedroll(EnumDyeColor.GRAY, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("gray_bedroll"));
    public static Block LIGHT_GRAY_BEDROLL = new BIBlockBedroll(EnumDyeColor.LIGHT_GRAY, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("light_gray_bedroll"));
    public static Block CYAN_BEDROLL = new BIBlockBedroll(EnumDyeColor.CYAN, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("cyan_bedroll"));
    public static Block PURPLE_BEDROLL = new BIBlockBedroll(EnumDyeColor.PURPLE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("purple_bedroll"));
    public static Block BLUE_BEDROLL = new BIBlockBedroll(EnumDyeColor.BLUE, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("blue_bedroll"));
    public static Block BROWN_BEDROLL = new BIBlockBedroll(EnumDyeColor.BROWN, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("brown_bedroll"));
    public static Block GREEN_BEDROLL = new BIBlockBedroll(EnumDyeColor.GREEN, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("green_bedroll"));
    public static Block RED_BEDROLL = new BIBlockBedroll(EnumDyeColor.RED, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("red_bedroll"));
    public static Block BLACK_BEDROLL = new BIBlockBedroll(EnumDyeColor.BLACK, Block.Properties.create(Material.CLOTH).hardnessAndResistance(0.2F, 0.3F).sound(SoundType.CLOTH)).setRegistryName(getResourceLocation("black_bedroll"));


    @SubscribeEvent
    public static void onRegisterBlock(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(WHITE_BEDROLL);
        registry.register(ORANGE_BEDROLL);
        registry.register(MAGENTA_BEDROLL);
        registry.register(LIGHT_BLUE_BEDROLL);
        registry.register(YELLOW_BEDROLL);
        registry.register(LIME_BEDROLL);
        registry.register(PINK_BEDROLL);
        registry.register(GRAY_BEDROLL);
        registry.register(LIGHT_GRAY_BEDROLL);
        registry.register(CYAN_BEDROLL);
        registry.register(PURPLE_BEDROLL);
        registry.register(BLUE_BEDROLL);
        registry.register(BROWN_BEDROLL);
        registry.register(GREEN_BEDROLL);
        registry.register(RED_BEDROLL);
        registry.register(BLACK_BEDROLL);

    }
    @SuppressWarnings("ConstantConditions")
    @SubscribeEvent
    public static void onRegisterItem(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(WHITE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(WHITE_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(ORANGE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(ORANGE_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(MAGENTA_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(MAGENTA_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(LIGHT_BLUE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(LIGHT_BLUE_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(YELLOW_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(YELLOW_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(LIME_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(LIME_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(PINK_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(PINK_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(GRAY_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(GRAY_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(LIGHT_GRAY_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(LIGHT_GRAY_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(CYAN_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(CYAN_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(PURPLE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(PURPLE_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(BLUE_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BLUE_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(BROWN_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BROWN_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(GREEN_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(GREEN_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(RED_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(RED_BEDROLL.getRegistryName()));
        registry.register(new ItemBlock(BLACK_BEDROLL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BLACK_BEDROLL.getRegistryName()));

    }
}
