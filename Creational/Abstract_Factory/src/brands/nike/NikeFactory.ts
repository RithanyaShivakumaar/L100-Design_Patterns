import { IBrandFactory } from '../../interfaces/BrandFactory';
import { IProduct } from '../../interfaces/Product';
import { IPricing } from '../../interfaces/Pricing';
import { ISpecs } from '../../interfaces/Specs';
import { IDeliveryInfo } from '../../interfaces/DeliveryInfo';
import { IRating } from '../../interfaces/Rating';
import { NikeProduct } from './NikeProduct';
import { NikePricing } from './NikePricing';
import { NikeSpecs } from './NikeSpecs';
import { NikeDeliveryInfo } from './NikeDeliveryInfo';
import { NikeRating } from './NikeRating';

export class NikeFactory implements IBrandFactory {
  createProduct(): IProduct {
    return new NikeProduct();
  }

  createPricing(): IPricing {
    return new NikePricing();
  }

  createSpecs(): ISpecs {
    return new NikeSpecs();
  }

  createDeliveryInfo(): IDeliveryInfo {
    return new NikeDeliveryInfo();
  }

  createRating(): IRating {
    return new NikeRating();
  }
}
