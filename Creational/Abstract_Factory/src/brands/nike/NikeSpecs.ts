import { ISpecs } from '../../interfaces/Specs';

export class NikeSpecs implements ISpecs {
  getMaterial(): string {
    return "Flyknit Mesh";
  }

  getItemDimensions(): string {
    return "30 x 10 x 12 cm";
  }

  getHeight(): string {
    return "12 cm";
  }

  getWeight(): string {
    return "450 g";
  }

  getCountryOfOrigin(): string {
    return "Vietnam";
  }

  isInStock(): boolean {
    return true;
  }

  getWarrantyPeriod(): string {
    return "1 year";
  }
}
