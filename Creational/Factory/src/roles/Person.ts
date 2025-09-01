import { IPerson } from '../interfaces/IPerson';

export abstract class Person implements IPerson {
  public name: string;
  public role: string;

  constructor(name: string) {
    this.name = name;
    this.role = 'Generic';
  }

  abstract markAttendance(): void;
}
