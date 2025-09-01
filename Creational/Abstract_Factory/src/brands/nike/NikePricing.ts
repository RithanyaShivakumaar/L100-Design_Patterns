import { IPricing } from '../../interfaces/Pricing';

export class NikePricing implements IPricing {
  getPrice(): number {
    return 10999;
  }

  getPricingType(): string {
    return "Flat";
  }

  getCurrency(): string {
    return "INR";
  }
}
