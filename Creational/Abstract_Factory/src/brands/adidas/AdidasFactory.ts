import { IBrandFactory } from '../../interfaces/BrandFactory';
import { IProduct } from '../../interfaces/Product';
import { IPricing } from '../../interfaces/Pricing';
import { ISpecs } from '../../interfaces/Specs';
import { IDeliveryInfo } from '../../interfaces/DeliveryInfo';
import { IRating } from '../../interfaces/Rating';
import { AdidasProduct } from './AdidasProduct';
import { AdidasPricing } from './AdidasPricing';
import { AdidasSpecs } from './AdidasSpecs';
import { AdidasDeliveryInfo } from './AdidasDeliveryInfo';
import { AdidasRating } from './AdidasRating';

export class AdidasFactory implements IBrandFactory {
  createProduct(): IProduct {
    return new AdidasProduct();
  }

  createPricing(): IPricing {
    return new AdidasPricing();
  }

  createSpecs(): ISpecs {
    return new AdidasSpecs();
  }

  createDeliveryInfo(): IDeliveryInfo {
    return new AdidasDeliveryInfo();
  }

  createRating(): IRating {
    return new AdidasRating();
  }
}
