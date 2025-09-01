import { IProduct } from './Product';
import { IPricing } from './Pricing';
import { ISpecs } from './Specs';
import { IDeliveryInfo } from './DeliveryInfo';
import { IRating } from './Rating';

export interface IBrandFactory {
  createProduct(): IProduct;
  createPricing(): IPricing;
  createSpecs(): ISpecs;
  createDeliveryInfo(): IDeliveryInfo;
  createRating(): IRating;
}
