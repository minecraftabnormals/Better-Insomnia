package com.betterinsomnia.tileentity;

import com.betterinsomnia.blocks.BIBlockBedroll;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TileEntityBedroll extends TileEntity {
	
	private EnumDyeColor color;
	
	public TileEntityBedroll() {
		
		super(TileEntityType.BED);
		
	}
	
	public TileEntityBedroll(EnumDyeColor colorIn) {
		
		this();
		this.setColor(colorIn);
		
	}
	
	public SPacketUpdateTileEntity getUpdatePacket() {
		
		return new SPacketUpdateTileEntity(this.pos, 11, this.getUpdateTag());
		
	}
	
	@OnlyIn(Dist.CLIENT)
	public EnumDyeColor getColor() {
		
		if (this.color == null) {
			
			this.color = ((BIBlockBedroll)this.getBlockState().getBlock()).getColor();
			
		}
		
		return this.color;
		
	}
	
	public void setColor(EnumDyeColor color) {
		
		this.color = color;
		
	}
	
}