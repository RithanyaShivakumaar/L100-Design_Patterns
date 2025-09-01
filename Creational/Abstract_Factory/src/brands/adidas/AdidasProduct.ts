import { IProduct } from '../../interfaces/Product';

export class AdidasProduct implements IProduct {
  getName(): string {
    return "Adidas Ultraboost";
  }

  getDescription(): string {
    return "Women's performance running shoes with boost midsole.";
  }

  getCategory(): string {
    return "Women";
  }

  getBrandName(): string {
    return "Adidas";
  }
}
