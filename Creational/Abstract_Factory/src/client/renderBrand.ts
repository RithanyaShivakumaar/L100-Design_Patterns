import { IBrandFactory } from '../interfaces/BrandFactory';

export function renderBrand(factory: IBrandFactory): void {
  const product = factory.createProduct();
  const pricing = factory.createPricing();
  const specs = factory.createSpecs();
  const delivery = factory.createDeliveryInfo();
  const rating = factory.createRating();

  console.log(`\n--- ${product.getBrandName()} Product ---`);
  console.log(`Name: ${product.getName()}`);
  console.log(`Description: ${product.getDescription()}`);
  console.log(`Category: ${product.getCategory()}`);
  console.log(`Price: ${pricing.getPrice()} ${pricing.getCurrency()} (${pricing.getPricingType()})`);
  console.log(`Material: ${specs.getMaterial()}`);
  console.log(`Dimensions: ${specs.getItemDimensions()}`);
  console.log(`Height: ${specs.getHeight()}, Weight: ${specs.getWeight()}`);
  console.log(`Origin: ${specs.getCountryOfOrigin()}, Warranty: ${specs.getWarrantyPeriod()}`);
  console.log(`In Stock: ${specs.isInStock()}`);
  console.log(`Delivery: ${delivery.getDeliveryModes().join(', ')} (ETA: ${delivery.getETA()})`);
  console.log(`Available Sizes: ${delivery.getSizesAvailable().join(', ')}`);
  console.log(`Return Policy: ${delivery.getReturnPolicy()}`);
  console.log(`Rating: ${rating.getRatingValue()} (${rating.getTotalReviews()} reviews)`);
}
