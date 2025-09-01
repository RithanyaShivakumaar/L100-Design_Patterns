import { IPricing } from '../../interfaces/Pricing';

export class AdidasPricing implements IPricing {
  getPrice(): number {
    return 11999;
  }

  getPricingType(): string {
    return "Discount";
  }

  getCurrency(): string {
    return "INR";
  }
}
