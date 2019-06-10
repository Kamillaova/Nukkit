package cn.nukkit.item.enchantment.trident;

import cn.nukkit.item.enchantment.Enchantment;

public class EnchantmentTridentRiptide extends EnchantmentTrident {
    public EnchantmentTridentRiptide() {
        super(Enchantment.ID_TRIDENT_RIPTIDE, "riptide", 2);
    }

    @Override
    public int getMinEnchantAbility(int level) {
        return level * 10;
    }

    @Override
    public int getMaxEnchantAbility(int level) {
        return this.getMinEnchantAbility(level) + 15;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}