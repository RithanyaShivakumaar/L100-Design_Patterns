import { IPerson } from '../interfaces/IPerson';

export interface LogEntry {
  name: string;
  role: string;
  timestamp: string;
}

export class AttendanceLogger {
  private static logs: LogEntry[] = [];

  static log(person: IPerson): void {
    const entry: LogEntry = {
      name: person.name,
      role: person.role,
      timestamp: new Date().toISOString(),
    };
    this.logs.push(entry);
    console.log(`[Log] Attendance recorded for ${entry.name} (${entry.role})`);
  }

  static exportLogsToConsole(): void {
    console.log('\n📋 Attendance Log Summary:\n', JSON.stringify(this.logs, null, 2));
  }

  static getLogs(): LogEntry[] {
    return [...this.logs];
  }

  static clearLogs(): void {
    this.logs = [];
  }
}
