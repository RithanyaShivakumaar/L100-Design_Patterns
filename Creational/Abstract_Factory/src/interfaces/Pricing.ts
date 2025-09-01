export interface IPricing {
  getPrice(): number;
  getPricingType(): string;
  getCurrency(): string;
}
