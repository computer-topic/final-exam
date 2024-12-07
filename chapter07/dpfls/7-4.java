public void registerItem(Item item) {
	if (item != null) { // NPE가 발생할 위험 존재 + 코드가 Null을 체크하는 로직으로 지저분해짐
		ItemRegistry registry = peristentStore.getItemRegistry();
		if (registry != null) {
			Item existing = registry.getItem(item.getID());
			if (existing.getBillingPeriod().hasRetailOwner()) {
				existing.register(item);
			}
		}
	}
}