import { ISpecs } from '../../interfaces/Specs';

export class AdidasSpecs implements ISpecs {
  getMaterial(): string {
    return "Primeknit";
  }

  getItemDimensions(): string {
    return "28 x 9 x 11 cm";
  }

  getHeight(): string {
    return "11 cm";
  }

  getWeight(): string {
    return "420 g";
  }

  getCountryOfOrigin(): string {
    return "India";
  }

  isInStock(): boolean {
    return true;
  }

  getWarrantyPeriod(): string {
    return "6 months";
  }
}
