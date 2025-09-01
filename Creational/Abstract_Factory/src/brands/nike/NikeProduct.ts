import { IProduct } from '../../interfaces/Product';

export class NikeProduct implements IProduct {
  getName(): string {
    return "Nike Air Max 270";
  }

  getDescription(): string {
    return "Men's running shoes with max air cushioning.";
  }

  getCategory(): string {
    return "Men";
  }

  getBrandName(): string {
    return "Nike";
  }
}
